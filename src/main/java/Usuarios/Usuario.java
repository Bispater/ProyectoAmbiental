package Usuarios;

import Contenido.Noticias;
import Contenido.PuntoReciclaje;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Usuario extends PersonaVirtual {
    private String Ciudad;
    private String contrasenia ;

    ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();
    ArrayList<PuntoReciclaje> ptosReciclajeDesuCiudad = new ArrayList<>() ;

    //El login de Usuarios sera mediante el rut y una contrasenia
    Scanner entrada = new Scanner(System.in);
    //Constructor
    public Usuario(){
        this.setNombre("");
        this.setRut("");
        this.Ciudad="";
        this.contrasenia="" ;
    }
    public Usuario( String ciudad , String contrasenia , String nombre , String rut){
       this.setNombre(nombre);
       this.setRut(rut);
       this.Ciudad=ciudad;
       this.contrasenia=contrasenia ;
    }

    //Getters & Setters
    public String getCiudad() {
        return this.Ciudad;
    }
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }


    public boolean ValidarPersona() {
        int contFail = 0;
        int flag = 0 ;


        System.out.println("Inserte rut");
        String rut = entrada.nextLine();
        while(!rut.matches("[0-9]*[-'][0-9]"))
        {
            contFail++;
            if(contFail ==5)
            {
                System.out.println("validacion fallida");
                flag = 1 ;
                return false ;
            }
            System.out.println("Dato incorrecto, debe escribir numeros con guion y digito verificador");
            System.out.println("Inserte rut");
             rut = entrada.next();
        }
        contFail = 0;

       System.out.print("Ingrese su contraseña: ");
       String contra = entrada.next();
        while(!contra.matches("([a-zA-Z]*+[0-9]*+)*")){
            contFail++;
            System.out.println("El dato es incorrecto, debe recibir al menos una letra y numero");

            if(contFail == 5) {

                System.out.println("Creacion fallida");
                flag = 1 ;
                return false ;
            }
            System.out.print("Ingrese nuevamente la  contraseña: ");
            contra = entrada.nextLine();
        }
        if( !Buscarenusurios(rut , contra ))
        {
            return false ;
        }
        for(int i = 0 ; i < usuariosRegistrados.size() ; i++) {
                if(Buscarenusurios(usuariosRegistrados.get(i).getRut() , usuariosRegistrados.get(i).contrasenia  ))
                {
                  this.setNombre(usuariosRegistrados.get(i).getNombre());
                  this.setRut(usuariosRegistrados.get(i).getRut());
                  this.contrasenia = usuariosRegistrados.get(i).contrasenia ;
                  this.Ciudad = usuariosRegistrados.get(i).Ciudad ;
                }
        }
        return true ;

    }

    public boolean Buscarenusurios(String rut , String contrasenia )
    {
        for(int i= 0 ; i< usuariosRegistrados.size() ; i++)
        {
            if( usuariosRegistrados.get(i).getRut().equals(rut) && usuariosRegistrados.get(i).contrasenia.equals(contrasenia) )
            {

                return true ;

            }


        }

        return false ;
    }
    public void CrearPersona(ArrayList<Usuario>usuarios){
        int id, contFail = 0;

        int flag = 0;


        //Valdiacion de formato de datos
        System.out.print("Inserte nombre natural:");
        String Nombre = entrada.nextLine();
        while (!Nombre.matches("([a-zA-Z]*[ ']+[a-zA-Z]*)*")) {
            contFail++;
            if (contFail == 5) {
                System.out.println("Creacion fallida");
                flag = 1;
                return;
            }
            System.out.println("El dato es incorrecto, debe escribir solo letras (nombre y apellido separados)");
            System.out.print("Inserte nombre nuavemente ");
            Nombre = entrada.nextLine();
        }
        if (flag == 1)
        {
            System.out.println("CREACION FALLIDA");
            return;

        }
        System.out.print("Inserte su Rut:");
        contFail = 0;
        String  Rut = entrada.next();
        while (!Rut.matches("[0-9]*[-'][0-9]")) {
            contFail++;
            if (contFail == 5) {
                System.out.println("Creacion fallida");
                flag = 1;
                return;
            }
            System.out.println("Dato incorrecto, debe escribir numeros con guion y digito verificador");
            System.out.print("Inserte su Rut:");
            Rut = entrada.next();
        }
        if (flag == 1)
        {
            System.out.println("CREACION FALLIDA");
            return;

        }

        System.out.print("Ingrese nueva contraseña: ");
        String contrasenia = entrada.next();
        while(!contrasenia.matches("([a-zA-Z]*+[0-9]*+)*")){
            contFail++;
            System.out.println("El dato es incorrecto, debe recibir al menos una letra y numero");

            if(contFail == 5) {

                System.out.println("Creacion fallida");
                flag = 1 ;
                return  ;
            }
            System.out.print("Ingrese nueva contraseña: ");
            contrasenia = entrada.next();
        }
        if (flag == 1)
        {
            System.out.println("CREACION FALLIDA");
            return;

        }
        contFail = 0;
        System.out.println("Inserte ciudad donde vive");
        String ciudad = entrada.nextLine();
        while(!ciudad.matches("[A-Z][a-z]*") ) {
            contFail++;
            System.out.println("Formato incorrecto , ingrese con solo la primera letra mayuscula");
            if(contFail ==5)
            {

                System.out.println("Creacion fallida");
                flag = 1 ;
                return ;
            }

            System.out.println("Inserte ciudad donde vive");
            ciudad = entrada.nextLine();
        }

        //String nombre , String rut , String ciudad , String contrasenia ){
        Usuario nuevoUsuario= new Usuario(Nombre , Rut , ciudad , contrasenia );
        usuarios.add(nuevoUsuario);
    }


 public void menuLogiado()
 {
     int opcion ;
     PuntoReciclaje ptoReciclaje = new PuntoReciclaje();
     Noticias noticias = new Noticias();
     System.out.println("ELIJA UNA OPCION:");
     System.out.println("1) Puntos de reciclaje cercanos\n2) Presentar noticias\n3) Consultar puntos de reciclaje por ciudad\n4) Presione 0 para salir");
     System.out.print("OPCION:");
     opcion = entrada.nextInt();
     try{
         switch (opcion){
             case 0 :
                 return;
             case 1 :
                 ptoReciclaje.PtoReciclajeCercano(this.Ciudad); //Busca puntosR de acuerdo a la ciudad ingresada
                 break;
             case 2 :
                 noticias.PresentarNoticia();
                 break;
             case 3 :
                 System.out.print("Ingrese la ciudad donde desea buscar: ");
                 String ciudad = entrada.nextLine();
                 while(!ciudad.matches("[A-Z][a-zA-Z]*")){
                     System.out.println("- Formato incorrecto. Ingrese solo letras, con la primera mayuscula\n");
                     System.out.print("Ingrese la ciudad donde desea buscar: ");
                     ciudad = entrada.nextLine();
                 }
                 ptoReciclaje.PtoReciclajeCercano(ciudad); //Busca puntosR de acuerdo a la ciudad ingresada
                 break;
             default :
                 throw new Exception("No se puede ejecutar esa opcion ");


         }

     }catch(Exception e)
     {
         e.printStackTrace();

     }

 }

    //Comportamientos y metodos
    public boolean validarUsuario(String rut, String contrasenia){
        BufferedReader lector;
        String linea;
        String file = "src/main/resources/usuarios/CSVusuarios.csv";
        try {
            lector = new BufferedReader(new FileReader(file));
            while ((linea = lector.readLine()) != null) {
                String str = linea;
                String[] partesDeLinea = str.split("[;]", 0);
                if (partesDeLinea[1].equals(rut) && partesDeLinea[2].equals(contrasenia)){
                    return true;
                }
            }
            lector.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    public boolean crearUsuario(String [] data) {
        String file = "src/main/resources/usuarios/CSVusuarios.csv";
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
}
