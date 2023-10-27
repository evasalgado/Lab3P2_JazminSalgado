/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_jazminsalgado;

/**
 *
 * @author evaja
 */
public class app_utilidad extends App{
    private String categoria;

    public app_utilidad() {
        super();
    }

    public app_utilidad(String categoria, String nombre, String Desarrollador, double precio, boolean estado, double rating, int cantdescarga) {
        super(nombre, Desarrollador, precio, estado, rating, cantdescarga);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncategoria de app=" + categoria ;
    }
    
    
}
