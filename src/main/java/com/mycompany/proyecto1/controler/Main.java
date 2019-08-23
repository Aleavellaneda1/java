/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1.controler;

import com.mycompany.proyecto1.view.PantallaPrincipal;

/**
 *
 * @author ismae
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(" Hola Mundo ");

        PantallaPrincipal app = new PantallaPrincipal();
        app.setSize(800, 600);
        app.setVisible(true);

    }
}
