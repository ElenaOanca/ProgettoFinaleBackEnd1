package it.epicode.CodeCampus.security;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Claims;
import it.epicode.CodeCampus.repository.UserRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)//per fare questo filtro per primo
public class JwtFilter extends OncePerRequestFilter {
    
	@Autowired
	JwtTools jwtUtil;
	
	@Autowired
	UserRepository repo;


    @Override
    protected void doFilterInternal(@NonNull final HttpServletRequest httpRequest,
                                    @NonNull final HttpServletResponse httpResponse,
                                    @NonNull final FilterChain filterChain) throws ServletException, IOException {
      
    	String token = jwtUtil.resolveToken(httpRequest);
    	
    	ObjectMapper mapper = new ObjectMapper();
    	System.out.println("JWT FILTER  "+ token);
    	System.out.println(httpRequest.getRequestURL().toString() + "   "+ httpRequest.getMethod());
    	 
    	
    	//continuo solo il token è valido
        if (token != null && !token.isEmpty()) {
        	
        	Claims claims = jwtUtil.resolveClaims(httpRequest);
        	//ArrayList<String> roles = jwtUtil.getRoles(claims);
        	//{"sub":"sarettah2","firstName":"sarah","lastName":"dal santo","exp":1927470568}
        	
        	System.out.println(mapper.writeValueAsString(claims));
        	
        	SecurityContext context = SecurityContextHolder.createEmptyContext(); 
        	Authentication authentication = new  UsernamePasswordAuthenticationToken(
            			claims.getSubject(), 
            			claims.get("token"), 
            			AuthorityUtils.createAuthorityList(claims.get("role").toString())); 
        	context.setAuthentication(authentication);
       
        	SecurityContextHolder.setContext(context); 
        	
        	// Create a new session and add the security context.
            HttpSession session = httpRequest.getSession(true);
            session.setAttribute("SPRING_SECURITY_CONTEXT", context);
           
        	
            filterChain.doFilter(httpRequest, httpResponse);
            
        }else if(httpRequest.getRequestURL().toString().contains("/auth") 
        		|| (httpRequest.getRequestURL().toString().contains("/courses") && httpRequest.getMethod().equals("GET") )
        		|| httpRequest.getMethod().equals("OPTIONS")){//nel caso di auth non serve l'autenticazione e nemmeno il jwt
        	
        	System.out.println("no token needed");
        	filterChain.doFilter(httpRequest, httpResponse);
            
        }else {//in ogni altro caso in cui non sia presente il token dò Unathorize
        	httpResponse.setStatus(401); 
        }

        
    }

}