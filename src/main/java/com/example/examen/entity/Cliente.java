package com.example.examen.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cliente {
    private String nombre;
    private String dni;
    private String domicilio;
    private List<Prestamo> prestamos;


    public Cliente(){}

    public Cliente(String nombre, String dni, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Cliente(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(Integer id) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
