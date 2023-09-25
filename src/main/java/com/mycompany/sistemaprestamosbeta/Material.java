package com.mycompany.sistemaprestamosbeta;

import java.util.ArrayList;

public class Material {

    private String nombre;
    private boolean mantenible;
    private boolean usaPotenciadores;
    private String descripcion;
    private String potenciadorEscogido;
    
    public Material(String nombre, boolean mantenible, boolean usaPotenciadores) {
        this.nombre = nombre;
        this.mantenible = mantenible;
        this.usaPotenciadores = usaPotenciadores;
    }
    
    public Material(String nombre, String descripcion, String potenciadorEscogido, boolean mantenible){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.mantenible = mantenible;
        this.potenciadorEscogido = potenciadorEscogido;
    }
    
    public String toString(){        
        return this.nombre + " " + this.descripcion + " Potenciador: " + potenciadorEscogido;
    }
    
    public Material(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMantenible() {
        return mantenible;
    }

    public void setMantenible(boolean mantenible) {
        this.mantenible = mantenible;
    }

    public boolean isUsaPotenciadores() {
        return usaPotenciadores;
    }

    public void setUsaPotenciadores(boolean usaPotenciadores) {
        this.usaPotenciadores = usaPotenciadores;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPotenciadorEscogido() {
        return potenciadorEscogido;
    }

    public void setPotenciadorEscogido(String potenciadorEscogido) {
        this.potenciadorEscogido = potenciadorEscogido;
    }
    
    
}
