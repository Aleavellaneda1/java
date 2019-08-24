/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itec.javasupermercado.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Avellaneda
 */
public class Empresa {

    private String razonSocial;
    private List<Cliente> listaDeClientes;
    private List<Empleado> listaDeEmpleados;
    
    public Empresa(){
        System.out.println("Objeto Empresa creado.");
        this.listaDeClientes  = new ArrayList<>();
        this.listaDeEmpleados = new ArrayList<>();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(List<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    public List<Empleado> getListaDeEmpleados() {
        return listaDeEmpleados;
    }

    public void setListaDeEmpleados(List<Empleado> listaDeEmpleados) {
        this.listaDeEmpleados = listaDeEmpleados;
    }
    
    
    
}
