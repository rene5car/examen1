package com.example.examen.dto;

import com.example.examen.entity.Prestamo;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter @Setter
public class PrestamoDTO {
    private String fecha;
    private String estado;
    private Date fechaDevolucion;
    private List<Prestamo> prestamos;
}