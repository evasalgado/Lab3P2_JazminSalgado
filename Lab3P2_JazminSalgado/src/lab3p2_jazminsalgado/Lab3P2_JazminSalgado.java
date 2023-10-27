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
    static ArrayList apps=new ArrayList();

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
                    menuAdministrador();
                    break;
                case 2:
                    menuUsuario();
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
                    agregarApp();
                    break;
                case 2:
                    BibliotecaApps();
                    break;
                case 3:
                    BibliotecaApps();
                    System.out.println("Ingrese el indice de la aplicacion a actualizar: ");
                    int a = leer.nextInt();
                    actualizacion(a);
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
    public static void agregarApp(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la aplicacion: ");
        String name= leer.nextLine();
        System.out.println("Ingrese el desarrollador de la aplicacion: ");
        String dev=leer.nextLine();
        System.out.println("Ingrese el precio de la aplicacion: ");
        double price = leer.nextDouble();
        System.out.println("El juego esta disponible?[s/n]: ");
        char resp = leer.next().charAt(0);
        boolean estado=true;
        switch (resp) {
            case 's':
                estado=true;
                break;
            case 'n':
                estado=false;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        } 
        System.out.println("Es la aplicacion: \n"
                + "a. App de utilidad\n"
                + "b. Juego");
        char opapp=leer.next().charAt(0);
        switch (opapp) {
            case 'a':
                System.out.println("Agregue la categoria de la app:");
                String cat=leer.nextLine();
                cat=leer.nextLine();
                apps.add(new app_utilidad(cat,name , dev, price, estado, 1, 0));
                break;
            case 'b':
                System.out.println("Ingrese la edad recomendada para poder jugar: ");
                int edad = leer.nextInt();
                apps.add(new juego(edad, name, dev, price, estado, 1, 0));
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
        System.out.println("Aplicacion agregada a la tienda exitosamente");
        
    }
    public static void BibliotecaApps(){
        if (apps.isEmpty()) {
            System.out.println("Aun no hay aplicaciones");
        } else{
            System.out.println("Biblioteca de aplicaciones");
            for (Object app : apps) {
            if (app instanceof App) {
                System.out.println(apps.indexOf(app)+"-"+app+"\n");
            }
        }
        }
    }
    public static void actualizacion(int i){
        if (apps.isEmpty()) {
            System.out.println("Aun no hay aplicaciones");
        } else {
            if (i>=0&&i<apps.size()) {
                if (apps.get(i) instanceof App) {
                    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la aplicacion: ");
        String name= leer.nextLine();
        System.out.println("Ingrese el desarrollador de la aplicacion: ");
        String dev=leer.nextLine();
        System.out.println("Ingrese el precio de la aplicacion: ");
        double price = leer.nextDouble();
        System.out.println("El juego esta disponible?[s/n]: ");
        char resp = leer.next().charAt(0);
        boolean estado=true;
        switch (resp) {
            case 's':
                estado=true;
                break;
            case 'n':
                estado=false;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        } 
        ((App)apps.get(i)).setNombre(name);
        ((App)apps.get(i)).setDesarrollador(dev);
        ((App)apps.get(i)).setPrecio(price);
        ((App)apps.get(i)).setEstado(estado);
        System.out.println("Es la aplicacion: \n"
                + "a. App de utilidad\n"
                + "b. Juego");
        char opapp=leer.next().charAt(0);
        switch (opapp) {
            case 'a':
                System.out.println("Agregue la categoria de la app:");
                String cat=leer.nextLine();
                cat=leer.nextLine();
                ((app_utilidad)apps.get(i)).setCategoria(cat);
                break;
            case 'b':
                System.out.println("Ingrese la edad recomendada para poder jugar: ");
                int edad = leer.nextInt();
                ((juego)apps.get(i)).setEdadrecomendada(edad);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
        System.out.println("Aplicacion actualizada exitosamente");
                }
            }
        }
    }
    
}
