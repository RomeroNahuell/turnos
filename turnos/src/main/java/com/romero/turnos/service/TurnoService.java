package com.romero.turnos.service;

import com.romero.turnos.model.Turno;
import com.romero.turnos.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // le dice a Spring que esta clase es un servicio y la registra automáticamente.
public class TurnoService {

    @Autowired // es inyección de dependencias, en lugar de hacer new TurnoRepository() Spring te lo entrega solo. Esto es una de las cosas más importantes de Spring.
    private TurnoRepository turnoRepository;

    public List<Turno> obtenerTodos() {
        return turnoRepository.findAll();
    }

    public Turno guardar(Turno turno) {
        return turnoRepository.save(turno);
    }

    public void eliminar(Long id) {
        turnoRepository.deleteById(id);
    }

    public Turno obtenerPorId(Long id) {
        return turnoRepository.findById(id).orElse(null);
    }

    public Turno actualizar(Long id, Turno turnoNuevo) {
        Turno turnoExistente = turnoRepository.findById(id).orElse(null);
        if (turnoExistente == null) {
            return null;
        }
        turnoExistente.setFecha(turnoNuevo.getFecha());
        turnoExistente.setHorario(turnoNuevo.getHorario());
        turnoExistente.setNombreCliente(turnoNuevo.getNombreCliente());
        turnoExistente.setEstado(turnoNuevo.getEstado());
        turnoExistente.setEspecialista(turnoNuevo.getEspecialista());
        return turnoRepository.save(turnoExistente);
    }
}