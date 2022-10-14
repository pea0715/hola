package com.example.preguntitasv2;

public class PuntuacioFinal {
    public int id;
    public String nombre;
    public String puntos;

    public PuntuacioFinal(int id, String nombre, String puntos) {
        this.id = id;
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\n' +
                "puntos='" + puntos + '\''
                ;
    }
}
