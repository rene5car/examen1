package com.example.examen.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemPrestamo {
    private Integer codigo;
    private String nombre;
    private String fechaDevolucion;

    public ItemPrestamo(Integer codigo, String nombre) {
    }

    public Integer getCodigo() {

        return codigo;
    }
}