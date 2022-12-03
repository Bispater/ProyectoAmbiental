package Programa_Principal;

import VistaMain.Principal;

import java.util.Scanner;

public class Main {
    public static Scanner entrada;

    public static void main(String[] args){

        //INICIA LA INTERFAZ CON LAS OPCIONES ANTES HECHAS POR CONSOLA.
        System.out.println("INICIANDO APLICACIÓN...");
        Principal VistaPrincipal = new Principal();
        VistaPrincipal.setVisible(true);
    }
}