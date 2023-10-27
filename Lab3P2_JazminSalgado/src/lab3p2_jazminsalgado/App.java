/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_jazminsalgado;

/**
 *
 * @author evaja
 */
public class App {
    protected String nombre;
    protected String Desarrollador;
    protected double precio;
    protected boolean estado;
    protected String rating;
    protected int cantdescarga;

    public App() {
    }

    public App(String nombre, String Desarrollador, double precio, boolean estado, String rating, int cantdescarga) {
        this.nombre = nombre;
        this.Desarrollador = Desarrollador;
        this.precio = precio;
        this.setEstado(estado);
        this.rating = rating;
        this.cantdescarga = cantdescarga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrollador() {
        return Desarrollador;
    }

    public void setDesarrollador(String Desarrollador) {
        this.Desarrollador = Desarrollador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        if (estado==true) {
            System.out.println("Disponible ");
        } else {
            System.out.println("No disponible");
        }
        this.estado = estado;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getCantdescarga() {
        return cantdescarga;
    }

    public void setCantdescarga(int cantdescarga) {
        this.cantdescarga = cantdescarga;
    }

    @Override
    public String toString() {
        return "nombre de app=" + nombre + "\n Nombre de Desarrollador=" + Desarrollador + "\n precio=" + precio + "\nestado=" + estado + "\n rating=" + rating + "\ncantidad de descargas=" + cantdescarga + '}';
    }
    
    
    
}
