/*package org.garbru.inicio;

import org.garbru.menus.Menu1;
import org.garbru.interfaces.Ejecutable;
import org.garbru.util.ReadUtil;
import org.garbru.menus.Menu;

public class Initation2 {

    public Initation2() {    }

    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        Menu1 menu1 = null;
        Ejecutable ejecutable = null;

        while( flag )
        {
            Menu.principal2( ); //CHANGE NAME
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            menu1 = Menu1.getTipoEjecutableById( opcion );
            if( Menu1.SALIR.equals(menu1) )
            {
                flag = false;
            }
            if( Menu1.OPCION_ERRONEA.equals(menu1) )
            {
                Menu.opcionInvalida( );
            }
            if( menu1.getEjecutable( ) != null )
            {
                ejecutable = menu1.getEjecutable( );
                ejecutable.run( );
            }
        }
    }
}
*/