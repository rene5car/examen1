package com.example.examen.repository;

import com.example.examen.entity.Cliente;
import com.example.examen.entity.ItemPrestamo;
import com.example.examen.entity.Prestamo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Sistema {
    private List<Prestamo> prestamos;

    private List<Cliente> clientes;

    private List<ItemPrestamo> items;

    private List<Sistema> sistemas;
}