package org.garbru.menus;
import org.garbru.model.figura1.Figura;

public class Menu
{
    public static void principal( )
    {
        System.out.println("WELCOME");
        System.out.println("PROGRAMA DE PIXUP");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Estado");
        System.out.println("2.- Municipio");
        System.out.println("3.- Salir");
    }

    public static void principal2( )
    {
        System.out.println("WELCOME");
        System.out.println("PROGRAMA DE PIXUP");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Consola");
        System.out.println("2.- Ventana");
        System.out.println("3.- Salir");

    }

    public static void opcionInvalida( )    {System.out.println("La opción no es correcta");     }

    public static void seleccionaOpcion( )    {System.out.println("Dame una opción");    }

    public static void errorDato( )    {System.out.println("No es un dato valido");    }

    public static void leeid( )    {System.out.println( "Dame un id" ); }

    public static void leeNombre( )    {System.out.println( "Dame un id" ); }

}
