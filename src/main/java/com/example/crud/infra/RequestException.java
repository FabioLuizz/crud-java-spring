package com.example.crud.infra;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RequestException {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity thread404() {
        ExceptionDTO response = new ExceptionDTO("Dado não encontrado!");
        return ResponseEntity.badRequest().body(response);
    }
}
