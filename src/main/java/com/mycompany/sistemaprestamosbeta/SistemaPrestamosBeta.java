package com.mycompany.sistemaprestamosbeta;

import java.util.ArrayList;
import javax.swing.*;

public class SistemaPrestamosBeta {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList materiales = new ArrayList();
        //int matricula, int tipoUsuario, String nombre, 
        //String apellidos, String correo, 
        //String contraseña, boolean estado, 
        //boolean tieneMaterialQueNoDebeSalir, String fechaDeCreacion, 
        //ArrayList materialesEnPosesion
        Alumno a = new Alumno(1177139, 1, "Pepe", "Pecas", "PicaPapas", 
        "1234", true, "12-2-2023");
        //VistaInicioSesion vistaSesion = new VistaInicioSesion();
        //vistaSesion.setVisible(true);
        //vistaSesion.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        VistaInicioSesion vistaEncargado = new VistaInicioSesion();
        vistaEncargado.setVisible(true);
        vistaEncargado.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
