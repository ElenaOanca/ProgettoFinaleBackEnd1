package it.epicode.CodeCampus.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import it.epicode.CodeCampus.repository.UserRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository repo;
	

  

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException  {
        
    	// find the user in db
	    it.epicode.CodeCampus.model.User userDto =  repo.findByUsername(username);
    	
	    if(userDto == null) {
	    	   throw new UsernameNotFoundException("User not found.");
	    }
	    
	    //costruisco manulamente un utente con i dati presi dal db
    	User.UserBuilder builder = User.builder();
        builder.username(username);
        builder.password(userDto.getPassword());
        builder.roles(userDto.getRole());
        

       return builder.build();
        
    }
}
