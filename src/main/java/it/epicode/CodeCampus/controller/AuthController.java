package it.epicode.CodeCampus.controller;




import it.epicode.CodeCampus.model.User;
import it.epicode.CodeCampus.service.AuthService;
import jakarta.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
@RestController // Indica che questa classe Ã¨ un controller REST
public class AuthController {

    @Autowired
    private AuthService authSvc; // Iniezione di dipendenza del servizio AuthService




    @PostMapping("/auth/register") // Mappatura per le richieste POST su /auth/register
    public User register(@RequestBody  User userDTO, ServletRequest req ){ //throws BadRequestException, InternalServerErrorException, org.apache.coyote.BadRequestException {
        // Metodo per la registrazione di un nuovo utente
        //if (validation.hasErrors()) // Se ci sono errori di validazione nei dati inviati
          //  throw new BadRequestException(ValidationMessages.generateValidationErrorMessage(validation)); // Solleva un'eccezione BadRequestException con i messaggi di validazione
        
   		System.out.println(userDTO);
		
    	return authSvc.register(userDTO); // Chiama il metodo del servizio per registrare un nuovo utente
    }
  
    @PostMapping("/auth/login") // Mappatura per le richieste POST su /auth/login
    public User login(@RequestBody @Validated User loginDTO, BindingResult validation) {// throws BadRequestException, UnauthorizedException, UnauthorizedException {
        // Metodo per l'autenticazione di un utente
        //if (validation.hasErrors()) // Se ci sono errori di validazione nei dati inviati
          //  throw new BadRequestException(ValidationMessages.generateValidationErrorMessage(validation));

       // AccessTokenRes token = authSvc.login(loginDTO.email(), loginDTO.password());
        //return token; // Chiama il metodo del servizio per effettuare il login
 
    	return  authSvc.login(loginDTO.getUsername(), loginDTO.getPassword());

    }
    
    @PutMapping("/auth/edit") // Mappatura per le richieste POST su /auth/login
    public User edit(@RequestBody @Validated User userDTO) {// throws BadRequestException, UnauthorizedException, UnauthorizedException {
    	return  authSvc.editUser(userDTO);
    }
    
    
    @GetMapping("/auth/getUsers")
    public  List<User> getUSers(){
    	return authSvc.getUsers();
    }


    

}