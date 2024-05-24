package cuentas;

import cuentas.CCuenta;

/**
 * Clase principal, contiene el main
 * @author Rocío Decuzzi Fernández
 */

public class Main {
    
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        operaciones(cuenta1);
    }    
    
    /**
     * Método con las llamadas a los métodos retirar e ingresar.
     * @param cuenta1 Cuenta donde se realizan las operaciones.
     */
    private static void operaciones(CCuenta cuenta1) {
        double saldoActual;
        // Operaciones de ingreso y retiro
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }    
}