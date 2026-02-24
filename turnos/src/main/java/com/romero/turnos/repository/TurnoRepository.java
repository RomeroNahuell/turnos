package com.romero.turnos.repository;

import com.romero.turnos.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnoRepository extends JpaRepository<Turno, Long> { //El <Turno, Long> le dice a JPA dos cosas: que esta interfaz trabaja con la clase Turno, y que el tipo de dato del ID es Long.
}