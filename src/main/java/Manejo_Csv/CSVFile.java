package Manejo_Csv;

import Usuarios.Admin;

import javax.swing.*;
import java.io.*;

public class CSVFile {

    private BufferedReader lector;
    private String linea;
    private String partes[] = null;

    public void writeCSV(String file, String[] header ){
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(header[0] + ";" + header[1] + ";" + header[2] + ";" + header[3]);
            printWriter.flush();
            printWriter.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public void escribirAdminCSV(String file, String[] header ){
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(header[0] + ";" + header[1] + ";" + header[2] + ";" + header[3]);
            printWriter.flush();
            printWriter.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
    public void leerArchivo(String nombreArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((linea = lector.readLine()) != null) {
                String str = linea;
                partes = str.split("[;]", 0);
                imprimirLinea(partes);
                System.out.println();
            }
            lector.close();
            linea = null;
            partes = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public int cantidadFilasCSV(String file) {
        int contadorLineas = 0;
        try {
            BufferedReader archivo = new BufferedReader(new FileReader(file));
            contadorLineas = 0;
            String linea = archivo.readLine();
            while (linea != null) {
                contadorLineas++;
            }
            archivo.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return contadorLineas;
    }

    public void imprimirLinea(String partes[]) {
        for (int i = 0; i < partes.length; i++) {
            System.out.print(partes[i] + "  |  ");
        }
    }

    public boolean comprobarAdminCSV(String file, String identificador, String contraseniaActual) {

        try {
            lector = new BufferedReader(new FileReader(file));
            while ((linea = lector.readLine()) != null) {
                String str = linea;
                String[] partesDeLinea = str.split("[;]", 0);
                if (partesDeLinea[2].equals(identificador) && partesDeLinea[3].equals(contraseniaActual)){
                    //Cambiar contraseña

                    return true;
                }
            }
            lector.close();
            linea = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
}