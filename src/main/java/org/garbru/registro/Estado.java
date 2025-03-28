package org.garbru.registro;

import org.garbru.menus.Menu;
import org.garbru.util.ReadUtil;

public class Estado extends Direccion{

    private int idEstado;
    private String nombreEstado;

    public Estado(){}

    public Estado(int id, String nombre) {
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
    }

    public int getId() {        return idEstado;    }

    public void setId(int id) {        this.idEstado = id;    }

    public String getNombreEstado() {        return nombreEstado;    }

    public void setNombreEstado(String nombreEstado) {        this.nombreEstado = nombreEstado;    }

    @Override
    public void leeDatos() {
        Menu.leeid();
        idEstado = ReadUtil.readInt();
        Menu.leeNombre();
        nombreEstado = ReadUtil.read();
    }

    @Override
    public int id() {        return idEstado;    }

    @Override
    public String nombre() {
        return nombreEstado;
    }
}