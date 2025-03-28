package org.garbru.vista;

import org.garbru.menus.Menu;
import org.garbru.registro.DirEnnum;
import org.garbru.interfaces.Ejecutable;
import org.garbru.interfaces.SolicitaDatos;
import org.garbru.registro.Direccion;
import org.garbru.util.FiguraFactory;
import org.garbru.util.ReadUtil;

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
    public void run( )
    {
        boolean flag = true;
        int opcion = 0;
        DirEnnum dirEnnum = null;
        while( flag )
        {
            Menu.principal( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            Direccion direccion = null;

            dirEnnum = DirEnnum.getFiguraEnumById( opcion );

            if( DirEnnum.SALIR.equals(dirEnnum) )
            {
                flag = false;
            }
            if( DirEnnum.OPCION_ERRONEA.equals(dirEnnum) )
            {
                Menu.opcionInvalida( );
            }

            Direccion = FiguraFactory.getFiguraByFiguraEnum(Direccion);
            if( dirEnnum != null )
            {
                ((SolicitaDatos)Direccion).leeDatos( );
            }
        }

    }
}
