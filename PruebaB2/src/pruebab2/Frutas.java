/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebab2;

/**
 *
 * @author ESFOT
 */
public class Frutas {
    private String Codigo;
    private String Nombre;
    private double Precio;

    public Frutas(String Codigo, String Nombre, double Precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Frutas{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Precio=" + Precio + '}';
    }

    
}
