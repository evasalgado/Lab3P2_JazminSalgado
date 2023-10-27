/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_jazminsalgado;

import java.util.Scanner;

/**
 *
 * @author evaja
 */
public class Lab3P2_JazminSalgado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int op=0;
        do {
            System.out.println("----MENU----\n"
                    + "1.Menu de Administrador\n"
                    + "2.Menu de usuario\n"
                    + "3.Salir\n");
            op=leer.nextInt();
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
        } while (op!=3);
    }
    
}
