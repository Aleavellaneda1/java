/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itec.javasupermercado.controler;

import com.itec.javasupermercado.model.Empresa;
import com.itec.javasupermercado.view.PantallaPrincipal;
/**
 *
 * @author ismae
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo:"); //imprime hola en la terninal
        PantallaPrincipal app = new PantallaPrincipal(); //crea la viste y se llama app
        app.setSize(400, 400); //establece la vista app a tamaño 400*400
        app.setVisible(true); // muestra a app
        //en este punto se muestra la ventana 
    }
}
