package Programa_Principal;
import VistaMain.Principal;
import Manejo_Csv.CSVFile;
import java.util.Scanner;
import Usuarios.*;
import java.io.FileReader;

public class Main {
    public static Scanner entrada;

    public static void main(String[] args){
        int opcion;
        int value = 0;

        entrada = new Scanner(System.in);

        do{
            //INICIA LA INTERFAZ CON LAS OPCIONES ANTES HECHAS POR CONSOLA.
            Principal VistaPrincipal = new Principal();
            VistaPrincipal.setVisible(true);

            System.out.println("============================");
            System.out.println("1.- ADMINISTRADOR");
            System.out.println("2.- USUARIO NORMAL");
            System.out.println("0.- EXIT");
            System.out.println("============================");
            System.out.print("ESCOGA UNA OPCION: ");
            opcion=entrada.nextInt();

            Admin adminDefecto = new Admin(); //Admin por defecto para poder ingresar

            Usuario usuarioDefecto = new Usuario();
            try {
                switch (opcion) {
                    case 1:
                        //adminDefecto.MenuAdministrador();
                        break;
                    case 2:
                        usuarioDefecto.MenuUsuario();
                        break;
                    case 0:
                        return;
                    default:
                        throw new Exception("No se puede ejecutar esa opcion ");
                }
            }catch(Exception e )
                {
                    e.printStackTrace();
                }
        }while(true);
    }
}