package com.example.examen.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter @Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Prestamo {
    private String fecha;
    private String estado;
    private Date fechaDevolucion;
    private ItemPrestamo item;

    public Prestamo(String fecha,ItemPrestamo item, Date fechaDevolucion){
        this.fecha = fecha;
        this.item = item;
        this.fechaDevolucion = fechaDevolucion;
    }

}