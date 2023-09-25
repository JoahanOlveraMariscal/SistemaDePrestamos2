package com.mycompany.sistemaprestamosbeta;

import java.util.ArrayList;

public class Prestamo {
    
    private int codigoSolicitante;
    private String nombreSolicitante;
    private String apellidoSolicitante;
    private String correoSolicitante;
    private String fechaCreacion;
    private String horaCreacion;
    private ArrayList materialesSolicitados;

    public Prestamo(int codigoSolicitante, String nombreSolicitante, String apellidoSolicitante, String correoSolicitante, String fechaCreacion, String horaCreacion, ArrayList materialesSolicitados) {
        this.codigoSolicitante = codigoSolicitante;
        this.nombreSolicitante = nombreSolicitante;
        this.apellidoSolicitante = apellidoSolicitante;
        this.correoSolicitante = correoSolicitante;
        this.fechaCreacion = fechaCreacion;
        this.horaCreacion = horaCreacion;
        this.materialesSolicitados = materialesSolicitados;
    }

    public int getCodigoSolicitante() {
        return codigoSolicitante;
    }

    public void setCodigoSolicitante(int codigoSolicitante) {
        this.codigoSolicitante = codigoSolicitante;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public String getApellidoSolicitante() {
        return apellidoSolicitante;
    }

    public void setApellidoSolicitante(String apellidoSolicitante) {
        this.apellidoSolicitante = apellidoSolicitante;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getCorreoSolicitante() {
        return correoSolicitante;
    }

    public void setCorreoSolicitante(String correoSolicitante) {
        this.correoSolicitante = correoSolicitante;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(String horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public ArrayList getMaterialesSolicitados() {
        return materialesSolicitados;
    }

    public void setMaterialesSolicitados(ArrayList materialesSolicitados) {
        this.materialesSolicitados = materialesSolicitados;
    }
    
    
    
}
