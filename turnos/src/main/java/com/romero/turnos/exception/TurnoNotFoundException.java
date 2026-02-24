package com.romero.turnos.exception;

public class TurnoNotFoundException extends RuntimeException {
    public TurnoNotFoundException(Long id) {
        super("No se encontró el turno con id: " + id);
    }
}