/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

import Libro.entidades.Libro;
import Libro.services.Servicios;

/**
 *
 * @author MegaTecnologia
 */
public class MainLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicios datos = new Servicios();
        Libro l1= datos.crearlibro();
        System.out.println(l1);

    }
    
}
