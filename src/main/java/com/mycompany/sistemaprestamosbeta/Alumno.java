package com.mycompany.sistemaprestamosbeta;

import java.util.ArrayList;

public class Alumno extends Usuario{
    
    private int matricula;
    private int tipoUsuario;

    public Alumno(int matricula, int tipoUsuario, String nombre, String apellidos, String correo, String contraseña, boolean estado, String fechaDeCreacion) {
        super(nombre, apellidos, correo, contraseña, estado, fechaDeCreacion, tipoUsuario);
        this.matricula = matricula;
        this.tieneMaterialQueNoDebeSalir = false;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    public Alumno(){
        
    }
}
