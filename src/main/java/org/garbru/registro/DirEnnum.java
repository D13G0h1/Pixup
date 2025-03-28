package org.garbru.registro;

public enum DirEnnum
{
    ESTADO(1),
    MUNICIPIO(2),
    SALIR(3),
    OPCION_ERRONEA(4);
    private Integer tipo;

    DirEnnum(Integer tipo)    {this.tipo = tipo;    }

    public Integer getTipo()    {return tipo;    }

    public static DirEnnum getFiguraEnumById(Integer id )    {
        switch( id )
        {
            case 1:
                return ESTADO;
            case 2:
                return MUNICIPIO;
            case 3:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }
}
