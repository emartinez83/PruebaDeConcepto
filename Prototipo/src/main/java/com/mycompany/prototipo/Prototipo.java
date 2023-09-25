/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prototipo;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Prototipo {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Google (simulado) para autenticación
        Google google = new Google();

        System.out.println("Iniciar sesión con Google");
        System.out.print("Correo electrónico: ");
        String correo = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        // Simular la autenticación con Google
        if (google.autenticar(correo, contrasena)) {
            System.out.println("Autenticación exitosa con Google.");

            // Crear un objeto Alumno autenticado (puedes definir esta clase según tus necesidades)
            Alumno alumno = new Alumno("Erick", correo, contrasena);

            // Luego, puedes continuar con la lógica de préstamo
            Laboratorio laboratorio = new Laboratorio("Laboratorio de computacion");
            Material material = new Material("Resistencia", "R1");
            laboratorio.agregarMaterial(material);
            

           laboratorio.realizarPrestamo(alumno);
            
        } else {
            System.out.println("La autenticación con Google ha fallado. Verifica tus credenciales.");
        }

        scanner.close();
    }
}
