package org.garbru.registro;

import org.garbru.interfaces.SolicitaDatos;

public abstract class Direccion implements SolicitaDatos {

    public Direccion() {    }

    public abstract int id();
    public abstract String nombre();
}
