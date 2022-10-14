package com.example.preguntitasv2;

public class Preguntas {
    private int id;
    private String Pregunta;
    private String Opcion1;
    private String Opcion2;
    private String Opcion3;
    private String Correcta;
    private int Puntuacion;

    public Preguntas(int id, String pregunta, String opcion1, String opcion2, String opcion3, String correcta, int puntuacion) {
        this.id = id;
        Pregunta = pregunta;
        Opcion1 = opcion1;
        Opcion2 = opcion2;
        Opcion3 = opcion3;
        Correcta = correcta;
        Puntuacion = puntuacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String pregunta) {
        Pregunta = pregunta;
    }

    public String getOpcion1() {
        return Opcion1;
    }

    public void setOpcion1(String opcion1) {
        Opcion1 = opcion1;
    }

    public String getOpcion2() {
        return Opcion2;
    }

    public void setOpcion2(String opcion2) {
        Opcion2 = opcion2;
    }

    public String getOpcion3() {
        return Opcion3;
    }

    public void setOpcion3(String opcion3) {
        Opcion3 = opcion3;
    }

    public String getCorrecta() {
        return Correcta;
    }

    public void setCorrecta(String correcta) {
        Correcta = correcta;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        Puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return
                "Pregunta=" + Pregunta + '\n' +
                        "Opciones=" + Opcion1 + '\'' + Opcion2 + '\'' +Opcion3 + '\n' +
                "Puntuacion=" + Puntuacion ;
    }
}
