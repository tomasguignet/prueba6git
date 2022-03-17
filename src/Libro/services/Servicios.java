/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.services;

import Libro.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Servicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Libro datos = new Libro();
    public Libro crearlibro(){
        System.out.println("Ingrese el titulo del libro");
        datos.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        datos.setAutor(leer.next());
        System.out.println("Ingrese el isbn del libro");
        datos.setIsbn(leer.next());
        System.out.println("Ingrese el paginas del libro");
        datos.setPaginas(leer.nextInt());
        return datos;
    }
    
    
}
