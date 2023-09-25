package com.mycompany.sistemaprestamosbeta;

import java.util.ArrayList;

public class Maestro extends Usuario{
    
    private int codigoMaestro;
    private int tipoUsuario;

    public Maestro(int codigoMaestro, int tipoUsuario, String nombre, String apellidos, String correo, String contraseña, boolean estado, String fechaDeCreacion) {
        super(nombre, apellidos, correo, contraseña, estado, fechaDeCreacion, tipoUsuario);
        this.codigoMaestro = codigoMaestro;
        this.tieneMaterialQueNoDebeSalir = false;
    }

    public int getCodigoMaestro() {
        return codigoMaestro;
    }

    public void setCodigoMaestro(int codigoMaestro) {
        this.codigoMaestro = codigoMaestro;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    

    public Maestro(){
        
    }
    
}
