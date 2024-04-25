package com.mycompany.bibliotecapoo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca {
    private LinkedList<Libro> libros;
    
    public Biblioteca(){
        libros = new LinkedList<>();
    }

    public void registrarLibro(Libro libro){
        
    }
    
    public void buscarLibro(String palabraBusqueda){
        
    }

    public void mostrarLibros(){
        for(int i=0;i>this.libros.size();i++){
            System.out.println(this.libros.get(i));
        }
    }
    
    public void mostrarLibrosNoLeidos(){
    }
    

}
