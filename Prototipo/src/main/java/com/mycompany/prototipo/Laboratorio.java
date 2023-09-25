/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototipo;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laboratorio {
    private String nombre;
    private List<Material> materialesDisponibles = new ArrayList<>();

    public Laboratorio(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMaterial(Material material) {
        materialesDisponibles.add(material);
    }

    public void mostrarMaterialesDisponibles() {
        System.out.println("Materiales disponibles en el laboratorio:");
        for (int i = 0; i < materialesDisponibles.size(); i++) {
            Material material = materialesDisponibles.get(i);
            System.out.println((i + 1) + ". " + material.getNombre() + " (" + material.getCodigo() + ")");
        }
    }

    public void realizarPrestamo(Alumno alumno) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar la lista de materiales disponibles
        mostrarMaterialesDisponibles();

        // Solicitar al usuario que elija un material
        System.out.print("Elija el número del material que desea prestar: ");
        int seleccion = scanner.nextInt();

        // Verificar si la selección es válida
        if (seleccion >= 1 && seleccion <= materialesDisponibles.size()) {
            Material materialSeleccionado = materialesDisponibles.get(seleccion - 1);
            System.out.println("Ha seleccionado: " + materialSeleccionado.getNombre());

            // Aquí puedes implementar la lógica para registrar el préstamo del material al alumno.
            // Por ejemplo, puedes agregarlo a una lista de préstamos del alumno o marcarlo como no disponible.

            System.out.println("El préstamo se ha realizado con éxito.");
        } else {
            System.out.println("Selección no válida. Por favor, elija un número válido.");
        }

        scanner.close();
    }
}
