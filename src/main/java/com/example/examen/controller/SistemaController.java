package com.example.examen.controller;

import com.example.examen.entity.Cliente;
import com.example.examen.entity.ItemPrestamo;
import com.example.examen.entity.Prestamo;
import com.example.examen.repository.Sistema;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SistemaController {

    @Autowired
    private Sistema sistema;

    @Autowired
    private ModelMapper modelMapper;

    private List<Prestamo> prestamos  = new ArrayList<Prestamo>();

    private List<Cliente> clientes  = new ArrayList<Cliente>();

    private List<ItemPrestamo> items  = new ArrayList<ItemPrestamo>();

    @GetMapping
    public List<Cliente> getClientes(){

        return clientes;
    }

    @PostMapping
    public void crearCliente(Cliente cliente){

        clientes.add(cliente);
    }

    @DeleteMapping
    public void eliminarCliente(String nombre){
        Optional<Cliente> optionalCliente = buscarCliente(nombre);
        if (optionalCliente.isPresent()){
            clientes.remove(optionalCliente.get());
        }
    }

    private Optional<Cliente> buscarCliente(String nombre) {
        return clientes.stream().filter(cliente -> cliente.getNombre().equalsIgnoreCase(nombre)).findFirst();
    }

    @PutMapping
    public void modificarCliente(Cliente cliente){
        eliminarCliente(cliente.getNombre());
        clientes.add(cliente);
    }
}