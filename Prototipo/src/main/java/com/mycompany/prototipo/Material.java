/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototipo;

public class Material{
    private String nombre;
    private String codigo;

    // Constructor
    public Material(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
}
