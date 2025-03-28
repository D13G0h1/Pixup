package org.garbru.model.figura1;

import org.garbru.interfaces.SolicitaDatos;

public abstract class Figura implements SolicitaDatos{
    public Figura()    {}

    public abstract double area( );

    public abstract double perimetro();
}