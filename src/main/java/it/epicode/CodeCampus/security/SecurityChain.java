package it.epicode.CodeCampus.security;


import static org.springframework.security.config.Customizer.withDefaults;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.CorsConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.servlet.Filter;

@Configuration
@EnableMethodSecurity
@EnableWebMvc
public class SecurityChain{

	@Autowired
	CustomUserDetailsService userDetailsService; // = new CustomUserDetailsService();
	
	/*@Autowired
	JwtAuthenticationFilter jwtTokenFilter;*/
	
	//filter chain per gestire le autenticazioni e autorizzazioni per accedere a determinate requests
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		System.out.println("SECURITY CHAIN");

        http.authorizeHttpRequests((authz) -> authz
        		.requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()//permetto tutte le chimaate con metodo OPTIONS
        		.requestMatchers(HttpMethod.GET, "/**").permitAll()//permetto tutte le chimaate con metodo GET
        		.requestMatchers(HttpMethod.POST, "/auth/**").permitAll()//permetto solo le chimaate con metodo POST che iniziano con '/auth'
        		 .requestMatchers(HttpMethod.PUT, "/auth/**").hasAnyRole("USER","ADMIN")//permetto solo le chiamate con metodo PUT che iniziano con '/auth' agli user USER e ADMIN
                .requestMatchers(HttpMethod.POST, "/admin/**").hasAnyRole("ADMIN")//permetto solo le chiamate con metodo POST che iniziano con '/admin' agli user ADMIN
                .requestMatchers(HttpMethod.PUT, "/admin/**").hasAnyRole("ADMIN")//permetto solo le chiamate con metodo PUT che iniziano con '/admin' agli user ADMIN
                .requestMatchers(HttpMethod.DELETE, "/admin/**").hasAnyRole("ADMIN")//permetto solo le chiamate con metodo DELETE che iniziano con '/admin' agli user ADMIN
              
                .anyRequest().authenticated()
                
               )
       	.logout((logout) -> logout.invalidateHttpSession(true))
            //.httpBasic(withDefaults())
            .csrf(CsrfConfigurer::disable);
            //.cors(withDefaults());
            
       
	
        
       return http.build();
    }
	
	

	//creo il bean per Autenticazione
	 @Bean
	    public AuthenticationProvider authenticationProvider() {
	        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
	        authenticationProvider.setUserDetailsService(userDetailsService);//gli passo il component CustomUserDetailsService
	        authenticationProvider.setPasswordEncoder(passwordEncoder()); //gli passo il bean passwordEncoder
	        return authenticationProvider;
	    }
	

    
    @Bean
    public PasswordEncoder passwordEncoder() {
    	return new BCryptPasswordEncoder();
    }
    
   
}
