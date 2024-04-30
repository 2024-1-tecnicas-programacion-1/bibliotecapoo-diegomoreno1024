package com.mycompany.bibliotecapoo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca {
    private LinkedList<Libro> libros;
    
    //Este constructor tiene una complejidad constante, O(1).
    public Biblioteca(){
        libros=new LinkedList<>();
    }
    //La complejidad de este método es constante, O(1).
    public void registrarLibro(Libro libro){
        libros.add(libro);
    }
    //La complejidad de este método es constante, O(1).
    public Libro buscarLibro(String palabraBusqueda){
        for (Libro libro : libros) {
            if(libro.getTitulo().equals(palabraBusqueda)||libro.getAutor().equals(palabraBusqueda)||libro.getGenero().equals(palabraBusqueda)){
                return libro;
            }
        }
        return null;
    }
    //La complejidad de este método es constante, O(1).
    public void mostrarLibros(){
        for(int i=0;i<this.libros.size();i++){
            System.out.println(this.libros.get(i));
        }
    }
    //La complejidad de este método es constante, O(1).
    public void mostrarLibrosNoLeidos(){
        for (Libro libro : libros) {
            if(libro.getNoLeido()==false){
                System.out.println(libro);
            }
        }
    }
    

}
