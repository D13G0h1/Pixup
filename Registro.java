package org.garbru.registro;

import org.garbru.vista.SolicitaDatos;

public abstract class Registro implements SolicitaDatos {
    public Registro() {    }

    public abstract int id();
    public abstract String nombre();
}
    