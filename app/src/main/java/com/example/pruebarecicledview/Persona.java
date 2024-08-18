package com.example.pruebarecicledview;

import java.io.Serializable;

public class Persona implements Serializable {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    private String nombre;
    private String apellido;

    public String toSrting(){
        return ("Nombre:" +nombre+"\nApellido:"+apellido);
    }
}
