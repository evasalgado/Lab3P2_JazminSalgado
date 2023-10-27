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
    static ArrayList apps = new ArrayList();

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
                    BibliotecaApps();
                    System.out.println("Ingrese el indice de la aplicacion a eliminar: ");
                    int eB = leer.nextInt();
                    eliminarAppB(eB);
                    break;
                case 5:
                    BibliotecaApps();
                    System.out.println("Ingrese el nombre del desarrollador: ");
                    String dev = leer.nextLine();
                    dev = leer.nextLine();
                    estadisticadeDev(dev);
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

    public static void menuUsuario() {
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
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre de la aplicacion a buscar: ");
                    String b = leer.nextLine();
                    b = leer.nextLine();
                    buscarApp(b);
                    break;
                case 2:
                    buscarCategoria();
                    break;
                case 3:
                    bibliotecaSistema();
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
        } while (op != 7);
    }

    public static void agregarApp() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la aplicacion: ");
        String name = leer.nextLine();
        System.out.println("Ingrese el desarrollador de la aplicacion: ");
        String dev = leer.nextLine();
        System.out.println("Ingrese el precio de la aplicacion: ");
        double price = leer.nextDouble();
        System.out.println("Es la aplicacion: \n"
                + "a. App de utilidad\n"
                + "b. Juego");
        char opapp = leer.next().charAt(0);
        switch (opapp) {
            case 'a':
                System.out.println("Agregue la categoria de la app:");
                String cat = leer.nextLine();
                cat = leer.nextLine();
                apps.add(new app_utilidad(cat, name, dev, price, false, 1, 0));
                break;
            case 'b':
                System.out.println("Ingrese la edad recomendada para poder jugar: ");
                int edad = leer.nextInt();
                apps.add(new juego(edad, name, dev, price, false, 1, 0));
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
        System.out.println("Aplicacion agregada a la biblioteca exitosamente");

    }

    public static void BibliotecaApps() {
        if (apps.isEmpty()) {
            System.out.println("Aun no hay aplicaciones");
        } else {
            System.out.println("Biblioteca de aplicaciones");
            for (Object app : apps) {
                if (app instanceof App) {
                    System.out.println(apps.indexOf(app) + "-" + app + "\n");
                }
            }
        }
    }

    public static void actualizacion(int i) {
        if (apps.isEmpty()) {
            System.out.println("Aun no hay aplicaciones");
        } else {
            if (i >= 0 && i < apps.size()) {
                if (apps.get(i) instanceof App) {
                    Scanner leer = new Scanner(System.in);
                    System.out.println("Ingrese el nombre de la aplicacion: ");
                    String name = leer.nextLine();
                    System.out.println("Ingrese el desarrollador de la aplicacion: ");
                    String dev = leer.nextLine();
                    System.out.println("Ingrese el precio de la aplicacion: ");
                    double price = leer.nextDouble();
                    ((App) apps.get(i)).setNombre(name);
                    ((App) apps.get(i)).setDesarrollador(dev);
                    ((App) apps.get(i)).setPrecio(price);
                    System.out.println("Aplicacion actualizada exitosamente");
                }
            }
        }
    }

    public static void eliminarAppB(int i) {
        if (apps.isEmpty()) {
            System.out.println("No hay aplicaciones en la biblioteca");
        } else {
            if (i >= 0 && i < apps.size()) {
                if (apps.get(i) instanceof App) {
                    System.out.println("Aplicacion " + ((App) apps.get(i)).getNombre() + " removida de la biblioteca");
                }
            }
        }
    }

    public static void estadisticadeDev(String dev) {
        if (apps.isEmpty()) {
            System.out.println("No hay aplicaciones aun");
        } else {
            for (int i = 0; i < apps.size(); i++) {
                if (((App) apps.get(i)).getDesarrollador().equalsIgnoreCase(dev)) {
                    System.out.println("Nombre de aplicacion: " + ((App) apps.get(i)).getNombre() + "\n"
                            + "Numero de descargas: " + ((App) apps.get(i)).getCantdescarga() + "\n"
                            + "Numero de Raitings: " + ((App) apps.get(i)).getRating());
                } else {
                    System.out.println("Desarrollador no esta en la lista");
                }
            }
        }
    }

    public static void buscarApp(String app) {
        Scanner leer = new Scanner(System.in);
        if (apps.isEmpty()) {
            System.out.println("No hay aplicaciones");
        } else {
            for (int i = 0; i < apps.size(); i++) {
                if (((App) apps.get(i)).getNombre().equalsIgnoreCase(app)) {
                    if (((App) apps.get(i)).getEstado() == true) {
                        System.out.println("La aplicacion " + app + " se encuentra en la biblioteca\n");

                    } else {
                        System.out.println("Desea descargarla?[s/n]:  ");
                        char resp = leer.next().charAt(0);
                        if (resp == 's') {
                            ((App) apps.get(i)).setEstado(true);
                            ((App) apps.get(i)).setCantdescarga( ((App) apps.get(i)).getCantdescarga()+1);
                        } else {
                            System.out.println("Descarga no realizada");

                        }
                    }

                } else {
                    System.out.println("La aplicacion no se encuentra en el sistema");
                }
            }
        }
    }

    public static void buscarCategoria() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la categoria a la que pertenece: ");
        String appu = leer.nextLine();
        for (Object app : apps) {
            if (((app_utilidad) app).getCategoria().equalsIgnoreCase(appu)) {
                System.out.println(apps.indexOf(app) + "-" + app + "\n");
                System.out.println("Desea descargar una aplicacion?[s/n]: ");
                char resp = leer.next().charAt(0);
                if (resp == 's') {
                    System.out.println("Ingrese el indice de la aplicacion que desea descargar: ");
                    int i = leer.nextInt();
                    if (i >= 0 && i < apps.size()) {
                        if (((app_utilidad) app).getEstado() == true) {
                            System.out.println("Aplicacion ya descargada");
                        } else {
                            ((app_utilidad) app).setEstado(true);
                             ((App) apps.get(i)).setCantdescarga( ((App) apps.get(i)).getCantdescarga()+1);
                        }
                    }
                } else {
                    System.out.println("Descarga de aplicacion no hecha");
                }

            }
        }

    }
    
    public static void bibliotecaSistema(){
        for (Object app : apps) {
            if (((App)app).getEstado()==true) {
                System.out.println(apps.indexOf(app)+"-"+app+"\n");
            }
        }
    }

}
