package com.romero.turnos.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity //le dice a JPA "esta clase es una tabla en la base de datos".
@Table(name = "turnos") //define el nombre de la tabla.
public class Turno {

    @Id// clave primaria.
    @GeneratedValue(strategy = GenerationType.IDENTITY)// hace que el id se genere automáticamente.
    private Long id;

    private LocalDate fecha;
    private LocalTime horario;
    private String nombreCliente;
    private String estado;
    private String especialista;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }
}
