package com.mycompany.bibliotecapoo;

import java.time.LocalDate;
import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args){
        Scanner leer= new Scanner(System.in);
        Biblioteca miBiblioteca= new Biblioteca();
         int opcion;
         do{
            System.out.println("Menú:");
            System.out.println("1. Ingresar Libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Marcar libro como leído");
            System.out.println("5. Mostrar libros no leídos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ha seleccionado Ingresar Libro");
                    System.out.println("Ingrese el título del libro:");
                    String titulo=leer.next();
                    System.out.println("Ingrese el autor del libro:");
                    String autor=leer.next();
                    System.out.println("Ingrese el género del libro:");
                    String genero= leer.next();
                    System.out.println("Ingrese el año de publicación del libro:");
                    int anioPublicacion=leer.nextInt();
                    if(anioPublicacion>LocalDate.now().getYear()){
                        System.out.println("Año invalido");
                    }else{         
                        Libro libroIngresado = new Libro(titulo,autor,anioPublicacion,genero);
                        miBiblioteca.registrarLibro(libroIngresado);
                    }
                    break;
                case 2:
                    System.out.println("Ha seleccionado Mostrar todos los libros");
                    miBiblioteca.mostrarLibros();
                    break;
                case 3:
                    System.out.println("Ha seleccionado Buscar libro");
                    miBiblioteca.buscarLibro(autor);
                    break;
                case 4:
                    System.out.println("Ha seleccionado Marcar libro como leído");
                    libroIngresado.marcarLeido();
                    break;
                case 5:
                    System.out.println("Ha seleccionado Mostrar libros no leídos");
                        miBiblioteca.mostrarLibrosNoLeidos();
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }while(opcion>=1||opcion<=6);
    }
}
