/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebab2;

import java.util.ArrayList;

/**
 *
 * @author ESFOT
 */
public class Cliente {
    private String Nombre;
    private String Cedula;
    private ArrayList<Cliente> cliente;

    public Cliente(String Nombre, String Cedula) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.cliente = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Cedula=" + Cedula + '}';
    }

    
}
