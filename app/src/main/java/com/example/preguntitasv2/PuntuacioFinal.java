package com.example.preguntitasv2;

public class PuntuacioFinal {
    public String nombre;
    public String puntos;

    public PuntuacioFinal(String nombre, String puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
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
