package org.garbru.util;

import org.garbru.registro.Estado;
import org.garbru.registro.Municipio;

public class FiguraFactory
{

    public static Estado getFiguraByFiguraEnum(Estado dirEnnum)
    {
        switch (dirEnnum)
        {
            case ESTADO:
                return new Estado();
            case MUNICIPIO:
                return new Municipio();
            case OPCION_ERRONEA:
            case SALIR:
            default:
                return null;
        }
    }
}
