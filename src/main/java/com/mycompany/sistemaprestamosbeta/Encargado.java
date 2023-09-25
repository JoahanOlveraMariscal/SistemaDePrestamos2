package com.mycompany.sistemaprestamosbeta;

import java.util.ArrayList;

public class Encargado extends Usuario{
    
    private int codigoEmpleado;
    private int tipoUsuario;

    public Encargado(int codigoEmpleado, int tipoUsuario, String nombre, String apellidos, String correo, String contraseña, boolean estado, String fechaDeCreacion) {
        super(nombre, apellidos, correo, contraseña, estado, fechaDeCreacion, tipoUsuario);
        this.codigoEmpleado = codigoEmpleado;
    }
    
    public Encargado(){
        
    }
    
}
