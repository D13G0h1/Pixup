package org.garbru.vista;

public class Consola implements Ejecutable
{
    private static Consola consola;
    private Consola()
    {
    }

    public static Consola getInstance( )
    {
        if(consola==null)
        {
            return new Consola();
        }
        return consola;
    }

    @Override
    public void run() {

    }
}
