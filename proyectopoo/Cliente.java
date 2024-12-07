/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

/**
 *
 * @author ester
 */
public class Cliente extends Usuarios {

    private double tamano_jardin;

// Constructor por defecto
    public Cliente() {
        super(0, "", "", 0, "", "");
        this.tamano_jardin = 0.0;
    }

// Parametros Construct
    public Cliente(int cedula, String nombre, String direccion, int telefono, String correo_electronico, String tipo, double tamano_jardin) {
        super(cedula, nombre, direccion, telefono, correo_electronico, tipo);
        this.tamano_jardin = tamano_jardin;
    }

    public double getTamano_jardin() {
        return tamano_jardin;
    }

    public void setTamano_jardin(double tamano_jardin) {
        this.tamano_jardin = tamano_jardin;
    }

    @Override
    public String toString(){
        return "Cliente{" +
                "cedula=" + getCedula() +
                ", nombre='" + getNombre() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono=" + getTelefono() +
                ", correo_electronico='" + getCorreo_electronico() + '\'' +
                ", tipo='" + getTipo() + '\'' +
                ", tamano_jardin=" + tamano_jardin +
                '}';
    }
}

