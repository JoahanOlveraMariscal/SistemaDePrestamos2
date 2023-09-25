package com.mycompany.sistemaprestamosbeta;

import java.util.ArrayList;

public class Usuario {

    protected String nombre;
    protected String apellidos;
    protected String correo;
    protected String contraseña;
    protected boolean estado;
    protected boolean tieneMaterialQueNoDebeSalir;
    protected String fechaDeCreacion;
    protected ArrayList materialesEnPosesion;
    protected int tipoUsuario;

    public Usuario(String nombre, String apellidos, String correo, String contraseña, boolean estado, String fechaDeCreacion, int tipoDeUsuario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
        this.estado = estado;
        this.fechaDeCreacion = fechaDeCreacion;
        this.tipoUsuario = tipoDeUsuario;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public Usuario(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isTieneMaterialQueNoDebeSalir() {
        return tieneMaterialQueNoDebeSalir;
    }

    public void setTieneMaterialQueNoDebeSalir(boolean tieneMaterialQueNoDebeSalir) {
        this.tieneMaterialQueNoDebeSalir = tieneMaterialQueNoDebeSalir;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public ArrayList getMaterialesEnPosesion() {
        return materialesEnPosesion;
    }

    public void setMaterialesEnPosesion(ArrayList materialesEnPosesion) {
        this.materialesEnPosesion = materialesEnPosesion;
    }
    
    
}
