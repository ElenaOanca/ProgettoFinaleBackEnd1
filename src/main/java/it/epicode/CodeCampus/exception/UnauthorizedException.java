package it.epicode.CodeCampus.exception;




public class UnauthorizedException extends RuntimeException{
    public UnauthorizedException(String message){
        super(message);
    }
}
