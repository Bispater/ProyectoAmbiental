package Usuarios;
import Contenido.Noticias;
import Contenido.PuntoReciclaje;
import Manejo_Csv.CSVFile;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;


public class Admin extends PersonaVirtual {

    private String Contrasenia;
    Scanner entrada = new Scanner(System.in);
    private String id ;
    ArrayList <Admin> administradores = new ArrayList<>();
    ArrayList<Usuario>usuariosRegistrados = new ArrayList<>();

    // Constructores
    public Admin() {
        this.setNombre("admin");
        this.setRut("00000000-0");
        this.id="";
        this.Contrasenia = "admin";
    }
    public Admin(String nombre , String run, String id , String contrasenia) {
        this.setNombre(nombre);
        this.setRut(run);
        this.id=id;
        this.Contrasenia = contrasenia;
    }

    // Geters y setters
    public String getContrasenia() {
        return this.Contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.Contrasenia = contrasenia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean ValidarAdministrador(String Id, String Password) {
        BufferedReader lector;
        String linea;
        try {
            lector = new BufferedReader(new FileReader("src/main/resources/administrador/CSVadmin.csv"));
            while ((linea = lector.readLine()) != null) {
                String str = linea;
                updateArrayListfromCSV(str); //PASAR DATOS DESDE EL CSV AL ARRAYLIST DE ADMINSITRADORES
            }
            lector.close();
            System.out.println("MOSTRAR DATOS DEL ARRAYLIST CREADO");
            for(int i=0;i<administradores.size();i++){
                System.out.println("DATO N" + i + " " + administradores.get(i).getId());
                System.out.println("DATO N" + i + " " + administradores.get(i).getContrasenia());
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        for (int i = 0; i < administradores.size(); i++) {
            if (administradores.get(i).getId().equals(Id) && administradores.get(i).getContrasenia().equals(Password)) {
                return true;
            }
        }
        return false;
    }

    public void updateArrayListfromCSV (String linea){
        String[] partesDeLinea = linea.split("[;]", 0);
        String nombreAdmin = partesDeLinea[0];
        String runAdmin = partesDeLinea[1];
        String idAdmin = partesDeLinea[2];
        String contraseniaAdmin = partesDeLinea[3];
        Admin nuevoAdmin = new Admin(nombreAdmin, runAdmin, idAdmin, contraseniaAdmin);
        administradores.add(nuevoAdmin);
    }

    //EL MÉTODO CREAR ADMIN INGRESA LOS DATOS EN EL CSV DE ADMINS.
    public boolean crearAdmin(String[] data) {
        try {
            CSVFile admin = new CSVFile();
            admin.escribirAdminCSV("src/main/resources/administrador/CSVadmin.csv", data);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        return true;
    }

    public boolean crearPuntoReciclaje(String[] data) {
        try {
            CSVFile admin = new CSVFile();
            admin.escribirPuntoReciclajeCSV("src/main/resources/puntos/CSVpuntos.csv", data);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        return true;
    }

    public int contarPTosdereciclaje() {
      int contadorMax=0;
      for(int i = 0 ; i < usuariosRegistrados.size() ; i++)
      {
          if(usuariosRegistrados.get(i).ptosReciclajeDesuCiudad.size() > contadorMax )
          {
              contadorMax=usuariosRegistrados.get(i).ptosReciclajeDesuCiudad.size();
          }
      }
        return contadorMax;
    }
}