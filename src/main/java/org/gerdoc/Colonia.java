package org.gerdoc;

public class Colonia {
    private int id;
    private String nombre;
    private String cp;
    private int idMunicipio;

    public Colonia(int id, String nombre, String cp, int idMunicipio) {
        this.id = id;
        this.nombre = nombre;
        this.cp = cp;
        this.idMunicipio = idMunicipio;
    }

    public int getId() {        return id;    }

    public void setId(int id) {        this.id = id;    }

    public String getNombre() {        return nombre;    }

    public void setNombre(String nombre) {        this.nombre = nombre;    }

    public String getCp() {        return cp;    }

    public void setCp(String cp) {        this.cp = cp;    }

    public int getIdMunicipio() {        return idMunicipio;    }

    public void setIdMunicipio(int idMunicipio) {        this.idMunicipio = idMunicipio;    }
}
