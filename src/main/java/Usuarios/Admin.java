package Usuarios;
import javax.swing.*;
import java.io.*;
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
        String file = "src/main/resources/administrador/CSVadmin.csv";
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(data[0] + ";" + data[1] + ";" + data[2] + ";" + data[3]);
            printWriter.flush();
            printWriter.close();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        return true;
    }

    public boolean comprobarAdminCSV(String file, String identificador, String contraseniaActual) {
        BufferedReader lector;
        String linea;
        try {
            lector = new BufferedReader(new FileReader(file));
            while ((linea = lector.readLine()) != null) {
                String str = linea;
                String[] partesDeLinea = str.split("[;]", 0);
                if (partesDeLinea[2].equals(identificador) && partesDeLinea[3].equals(contraseniaActual)){
                    return true;
                }
            }
            lector.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
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