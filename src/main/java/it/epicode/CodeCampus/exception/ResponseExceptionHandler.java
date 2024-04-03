package it.epicode.CodeCampus.exception;
/*
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import it.epicode.CodeCampus.exception.BadRequestException;
import it.epicode.CodeCampus.exception.NotFoundException;
import it.epicode.CodeCampus.exception.UnauthorizedException;


@RestControllerAdvice
public class ResponseExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse notFoundExceptionHandler(NotFoundException e){
        return new ErrorResponse(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse ExceptionHandler(Exception e){
        return new ErrorResponse(e.getMessage());
    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse badRequestExceptionHandler(BadRequestException e){
        return new ErrorResponse(e.getMessage());
    }

    @ExceptionHandler(it.epicode.CodeCampus.exception.UnauthorizedException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ErrorResponse unAuthorizedExceptionHandler(it.epicode.CodeCampus.exception.UnauthorizedException e){
        return new ErrorResponse(e.getMessage());
    }


}



*/















//
//
//import org.springframework.data.crossstore.ChangeSetPersister;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class ResponseExceptionHandler {
//
//    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
//    public ResponseEntity<ErrorResponse> handleNotFoundException(ChangeSetPersister.NotFoundException ex) {
//        ErrorResponse error = new ErrorResponse(ex.getMessage(), HttpStatus.NOT_FOUND.value(), System.currentTimeMillis());
//        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler(LoginFaultException.class)
//    public ResponseEntity<ErrorResponse> handleLoginFaultException(LoginFaultException ex) {
//        ErrorResponse error = new ErrorResponse(ex.getMessage(), HttpStatus.UNAUTHORIZED.value(), System.currentTimeMillis());
//        return new ResponseEntity<>(error, HttpStatus.UNAUTHORIZED);
//    }
//
//    // Gestisci altre eccezioni qui...
//
//    @ExceptionHandler(UnAuthorizedException.class)
//    public ResponseEntity<ErrorResponse> handleUnAuthorizedException(UnAuthorizedException ex) {
//        ErrorResponse error = new ErrorResponse(ex.getMessage(), HttpStatus.FORBIDDEN.value(), System.currentTimeMillis());
//        return new ResponseEntity<>(error, HttpStatus.FORBIDDEN);
//    }
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex) {
//        ErrorResponse error = new ErrorResponse(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), System.currentTimeMillis());
//        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//}
