package com.romero.turnos.controller;

import com.romero.turnos.model.Turno;
import com.romero.turnos.service.TurnoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //le dice a Spring que esta clase recibe y responde peticiones HTTP.
@RequestMapping("/turnos") //define la URL base de tu API.
public class TurnoController {

    @Autowired
    private TurnoService turnoService;

    @GetMapping //definen qué tipo de petición HTTP maneja cada metodo
    public List<Turno> obtenerTodos() {
        return turnoService.obtenerTodos();
    }

    @PostMapping
    public Turno guardar(@Valid @RequestBody Turno turno) { //significa que el turno viene en el cuerpo de la petición.
        return turnoService.guardar(turno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Turno> actualizar(@PathVariable Long id, @Valid @RequestBody Turno turno) {
        return ResponseEntity.ok(turnoService.actualizar(id, turno));
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {// agarra el id de la URL, por ejemplo /turnos/1.
        turnoService.eliminar(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turno> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(turnoService.obtenerPorId(id));
    }



}