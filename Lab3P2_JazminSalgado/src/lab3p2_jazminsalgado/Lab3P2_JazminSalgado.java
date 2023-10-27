/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_jazminsalgado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author evaja
 */
public class Lab3P2_JazminSalgado {

    /**
     * @param args the command line arguments
     */
    static ArrayList usuario = new ArrayList();

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int op = 0;
        do {
            System.out.println("----MENU----\n"
                    + "1.Menu de Administrador\n"
                    + "2.Menu de usuario\n"
                    + "3.Salir\n");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Gracias por utilizar mi programa");
                    break;
                default:
                    System.out.println("Numero ingresado no es valido");
                    break;
            }
        } while (op != 3);
    }

    public static void menuAdministrador() {
        Scanner leer = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("---MENU DE ADMINISTRADOR---\n"
                    + "1. Agregar aplicacion\n"
                    + "2. Biblioteca\n"
                    + "3. Actualizacion\n"
                    + "4. Eliminar Aplicacion\n"
                    + "5. Estadisticas de Desarrollador\n"
                    + "6. Volver al menu principal");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Regresando al menu principal...");
                    break;
                default:
                    System.out.println("Numero ingresado no es valido");
                    break;
            }
        } while (op != 6);

    }
    public static void menuUsuario(){
        Scanner leer = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("---MENU DE USUARIO---\n"
                    + "1. Buscar por nombre\n"
                    + "2. Buscar por categoria\n"
                    + "3. Biblioteca\n"
                    + "4. Mostrar descargas\n"
                    + "5. Eliminar descarga\n"
                    + "6. Calificar Aplicacion\n"
                    + "7. Volver al menu");
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    
                    break;
                case 7: 
                    System.out.println("Regresando al menu principal...");
                    break;
                default:
                    System.out.println("Numero ingresado no es valido");
                    break;
            }
        } while (op!=7);
    }
    public void agregarApp(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la aplicacion: ");
        String app = leer.nextLine();
        app = leer.nextLine();
        System.out.println("Ingrese el desarrollador de la aplicacion: ");
        String dev=leer.nextLine();
        System.out.println("Ingrese el precio de la aplicacion: ");
        double price = leer.nextDouble();
    }
}
