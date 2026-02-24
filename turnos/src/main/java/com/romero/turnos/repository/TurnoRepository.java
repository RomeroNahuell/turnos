package com.romero.turnos.repository;

import com.romero.turnos.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TurnoRepository extends JpaRepository<Turno, Long> { //El <Turno, Long> le dice a JPA dos cosas: que esta interfaz trabaja con la clase Turno, y que el tipo de dato del ID es Long.
    List<Turno> findByFecha(LocalDate fecha); //Spring Data JPA lee el nombre del metodo y automáticamente genera la consulta SQL. findBy significa "buscar por" y Fecha es el campo
}