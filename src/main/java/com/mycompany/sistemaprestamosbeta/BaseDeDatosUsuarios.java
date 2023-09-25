package com.mycompany.sistemaprestamosbeta;

import java.util.ArrayList;

public class BaseDeDatosUsuarios {
    
    private ArrayList<Alumno> alumnos;
    private ArrayList<Maestro> maestros;
    private ArrayList<Encargado> encargadosDeLaboratorio;
    
    public BaseDeDatosUsuarios(){
        alumnos = new ArrayList<>();
        maestros = new ArrayList<>(); 
        encargadosDeLaboratorio = new ArrayList<>();
        crearBDAlumnos();
        crearBDMaestros();
        crearBDEncargados();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Maestro> getMaestros() {
        return maestros;
    }

    public void setMaestros(ArrayList<Maestro> maestros) {
        this.maestros = maestros;
    }

    public ArrayList<Encargado> getEncargadosDeLaboratorio() {
        return encargadosDeLaboratorio;
    }

    public void setEncargadosDeLaboratorio(ArrayList<Encargado> encargadosDeLaboratorio) {
        this.encargadosDeLaboratorio = encargadosDeLaboratorio;
    }
    
    
    
    public void crearBDAlumnos(){
        Alumno a1 = new Alumno(1177139, 1, "Pepe", "Pecas", "perro", "contraseña", true, "16-09-2023");
        Alumno a2 = new Alumno(1165104, 1, "Pedro", "Parker", "gato", "contraseña", true, "16-09-2023");
        Alumno a3 = new Alumno(1185194, 1, "Paco", "Hugo", "pato", "contraseña", true, "16-09-2023");
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
    }
    
    public void crearBDMaestros(){
        Maestro m1 = new Maestro(1177139, 2, "Pepe", "Pecas", "profe1@uabc", "contraseña", true, "16-09-2023");
        Maestro m2 = new Maestro(1165104, 2, "Pedro", "Parker", "profe2@uabc", "contraseña", true, "16-09-2023");
        Maestro m3 = new Maestro(1185194, 2, "Paco", "Hugo", "profe3@uabc", "contraseña", true, "16-09-2023");
        maestros.add(m1);
        maestros.add(m2);
        maestros.add(m3);
    }
    
    public void crearBDEncargados(){
        Encargado e1 = new Encargado(1177139, 3, "Pepe", "Pecas", "encargado1@uabc", "contraseña", true, "16-09-2023");
        Encargado e2 = new Encargado(1165104, 3, "Pedro", "Parker", "encargado2@uabc", "contraseña", true, "16-09-2023");
        Encargado e3 = new Encargado(1185194, 3, "Paco", "Hugo", "encargado3@uabc", "contraseña", true, "16-09-2023");
        encargadosDeLaboratorio.add(e1);
        encargadosDeLaboratorio.add(e2);
        encargadosDeLaboratorio.add(e3);
    }
}
