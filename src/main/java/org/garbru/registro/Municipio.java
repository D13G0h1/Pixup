package org.garbru.registro;


import org.garbru.menus.Menu;
import org.garbru.util.ReadUtil;

public class Municipio extends Estado {
    private int idMunicipio;
    private String nombreMunicipio;

    public Municipio(){}

    public Municipio(int id, String nombre, int idMunicipio, String nombreMunicipio) {
        super(id, nombre);
        this.idMunicipio = idMunicipio;
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public int getIdMunicipio() {        return idMunicipio;    }

    public void setIdMunicipio(int idMunicipio) {        this.idMunicipio = idMunicipio;        }

    @Override
    public int id() {
        return idMunicipio;
    }

    @Override
    public String nombre() {
        return nombreMunicipio;
    }

    @Override
    public void leeDatos() {
        Menu.leeid();
        idMunicipio = ReadUtil.readInt();
        Menu.leeNombre();
        nombreMunicipio = ReadUtil.read();
    }
}
