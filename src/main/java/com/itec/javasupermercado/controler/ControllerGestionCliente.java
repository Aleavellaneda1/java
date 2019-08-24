/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itec.javasupermercado.controler;

import com.itec.javasupermercado.model.Cliente;
import com.itec.javasupermercado.model.Empresa;
import com.itec.javasupermercado.model.Empleado;
import com.itec.javasupermercado.model.TipoEmpleado;

/**
 *
 * @author Alejandro Avellaneda
 */
public class ControllerGestionCliente {

     private Empresa empresa;
    public ControllerGestionCliente() {
   
        Cliente c1 = new Cliente();
        ///aca hayq ue crear la lista dclientes para guardar en la empresas 
         empresa = new Empresa();
         
         
          
    }
    
    
    
    public void create(Cliente c) {
        
        empresa.setListaDeClientes(c);
       // System.out.println(c.getApellido());
        
        
    }
    
    
  
   
    
    
    
    
    

   
}
