package br.edu.ufrn.store.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleProductRegistrationException(RuntimeException ex) {
        return new ResponseEntity<>("Erro ao tentar registrar o produto: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
