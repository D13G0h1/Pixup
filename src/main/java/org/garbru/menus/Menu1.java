package org.garbru.menus;

import org.garbru.vista.Consola;
import org.garbru.interfaces.Ejecutable;
import org.garbru.vista.Ventana;

public enum Menu1 {
    CONSOLA(1, Consola.getInstance()),
    VENTANA(2, Ventana.getInstance()),
    SALIR(3, null),
    OPCION_ERRONEA(4, null);
    private Integer id;
    private Ejecutable ejecutable;

    Menu1(Integer id, Ejecutable ejecutable) {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId() {
        return id;
    }

    public static Menu1 getTipoEjecutableById(int opcion) {
        switch (opcion) {
            case 1:
                return CONSOLA;
            case 2:
                return VENTANA;
            case 3:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }

    public Ejecutable getEjecutable() {
        return ejecutable;
    }
}