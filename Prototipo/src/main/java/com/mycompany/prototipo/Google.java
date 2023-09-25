/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototipo;

public class Google {
    // Simulamos algunas cuentas de Google válidas
    private static final String CORREO_VALIDO = "emartinez83@uabc.edu.mx";
    private static final String CONTRASENA_VALIDA = "contra123";

    public boolean autenticar(String correo, String contrasena) {
        // Simulamos la autenticación con Google
        if (CORREO_VALIDO.equals(correo) && CONTRASENA_VALIDA.equals(contrasena)) {
            return true;
        }
        return false;
    }
}
