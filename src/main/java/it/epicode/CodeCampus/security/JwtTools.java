package it.epicode.CodeCampus.security;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.crypto.SecretKey;

import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import it.epicode.CodeCampus.model.User;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class JwtTools {


    private final String secret_key = "9a4f2c8d3b7a1e6f45c8a0b3f267d8b1d4e6f3c8a9d2b5f8e3a9c8b5f6v8a3d9";
    SecretKey secret;
    private long accessTokenValidity = 60*60*1000;

    private final JwtParser jwtParser;

    private final String TOKEN_HEADER = "Authorization";
    private final String TOKEN_PREFIX = "Bearer ";

    public JwtTools(){
    	secret = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secret_key));
        this.jwtParser = Jwts.parserBuilder().setSigningKey(secret).build();
    }

    public String createToken(User user) {
        Claims claims = Jwts.claims().setSubject(user.getUsername());
        claims.put("firstName",user.getFirstName());
        claims.put("lastName",user.getLastName());
        claims.put("password",user.getPassword());
        claims.put("role",user.getRole());
        Date tokenCreateTime = new Date();
        Date tokenValidity = new Date(tokenCreateTime.getTime() + TimeUnit.MINUTES.toMillis(accessTokenValidity));
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(tokenValidity)
                .signWith(secret,SignatureAlgorithm.HS256)
                .compact();
    }

    private Claims parseJwtClaims(String token) {
        return jwtParser.parseClaimsJws(token).getBody();
    }

    public Claims resolveClaims(HttpServletRequest req) {
        try {
            String token = resolveToken(req);
            if (token != null && !token.isEmpty()) {
                return parseJwtClaims(token);
            }
            return null;
        } catch (ExpiredJwtException ex) {
            req.setAttribute("expired", ex.getMessage());
            throw ex;
        } catch (Exception ex) {
            req.setAttribute("invalid", ex.getMessage());
            throw ex;
        }
    }


    public String resolveToken(HttpServletRequest request) {

        String bearerToken = request.getHeader("Token"); // request.getHeader(TOKEN_HEADER);
        System.out.println("resolveToken "+bearerToken);
        if (bearerToken != null && bearerToken.startsWith(TOKEN_PREFIX)) {
            return bearerToken.substring(TOKEN_PREFIX.length());
        }
        return null;
    }

    public boolean validateClaims(Claims claims) throws AuthenticationException {
        try {
            return claims.getExpiration().after(new Date());
        } catch (Exception e) {
            throw e;
        }
    }

    /*public String getEmail(Claims claims) {
        return claims.getSubject();
    }

    private List<String> getRoles(Claims claims) {
        return (List<String>) claims.get("roles");
    }
    */


}