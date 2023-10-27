/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_jazminsalgado;

/**
 *
 * @author evaja
 */
public class juego extends App{
    private int edadrecomendada;

    public juego() {
        super();
    }

    public juego(int edadrecomendada, String nombre, String Desarrollador, double precio, boolean estado, String rating, int cantdescarga) {
        super(nombre, Desarrollador, precio, estado, rating, cantdescarga);
        this.edadrecomendada = edadrecomendada;
    }

    public int getEdadrecomendada() {
        return edadrecomendada;
    }

    public void setEdadrecomendada(int edadrecomendada) {
        this.edadrecomendada = edadrecomendada;
    }

    @Override
    public String toString() {
        return super.toString() + "\n edad recomendada para jugar=" + edadrecomendada + '}';
    }
    
    
}
