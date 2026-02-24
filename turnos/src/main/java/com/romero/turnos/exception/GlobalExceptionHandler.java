package com.romero.turnos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //le dice a Spring que esta clase se encarga de manejar excepciones de toda la aplicación.
public class GlobalExceptionHandler {

    @ExceptionHandler(TurnoNotFoundException.class)//indica qué excepción maneja ese método.
    public ResponseEntity<String> handleTurnoNotFound(TurnoNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}