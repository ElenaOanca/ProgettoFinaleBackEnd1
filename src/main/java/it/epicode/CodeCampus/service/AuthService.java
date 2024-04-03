package it.epicode.CodeCampus.service;


import it.epicode.CodeCampus.model.User;


import it.epicode.CodeCampus.repository.UserRepository;
import it.epicode.CodeCampus.security.JwtTools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class AuthService {
    @Autowired
    private UserRepository userRp;

    @Autowired
	PasswordEncoder pswEncoder;

    @Autowired
    private JwtTools jwtTools;

    // Metodo per registrare un nuovo utente
    public User register(User userDTO) {//throws BadRequestException, InternalServerErrorException {
    	userDTO.setLastUpdate(new Date());
    	String password = userDTO.getPassword();
    	userDTO.setPassword(pswEncoder.encode(password));
		
    	User userResponse = userRp.save(userDTO); // Salva l'utente nel repository degli utenti
    	
    	//creo il token dopo ave salvato lo user (per non salvarre il token in db)
    	String token = jwtTools.createToken(userDTO);
    	userResponse.setToken(token);
    	
        return userResponse; //ritorno lo user salvato + token
     
      
    }

    // Metodo per trovare un utente per ID
    public Optional<User> findUserById(Long id) {
        return userRp.findById(id);
    }
    
    public User login(String username, String password) {
    	
    	
    	User user =  userRp.findByUsername(username);
	      
	    //se non c'è metto badCredentials //se le password non corrisopondono metto badCredentials
	    if ( user == null || !pswEncoder.matches(password, user.getPassword())) {
	      throw new BadCredentialsException("Bad credentials provided");
	    }
	    
	    String token = jwtTools.createToken(user);
    	user.setToken(token);
		
		return user;
    	
    }
    
    public List<User> getUsers() {
    	return userRp.findAll();
    }
    
    
    public User editUser(User userDTO) {
    	userDTO.setLastUpdate(new Date());
    	User userResponse = userRp.save(userDTO); // Salva l'utente nel repository degli utenti
    	
    	//creo il token dopo ave salvato lo user (per non salvarre il token in db)
    	String token = jwtTools.createToken(userDTO);
    	userResponse.setToken(token);
    	
        return userResponse; //ritorno lo user salvato + token
    }


}
