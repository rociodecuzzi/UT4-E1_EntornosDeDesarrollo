package cuentas;

public class CCuenta {
    String nombre;
    String cuenta;
    double saldo;
    double tipoInterés;

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    public double estado() {
        return saldo;
    }

    public void retirar(double cantidad) {
        try {
            System.out.println("Retiro en cuenta:" + cantidad);
            if (cantidad <= 0) {
                throw new Exception("No se puede retirar una cantidad negativa");
            }
            if (estado() < cantidad) {
                throw new Exception("No se hay suficiente saldo");
            }
            saldo = saldo - cantidad;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ingresar(double cantidad) {
        try {
            System.out.println("Ingreso en cuenta:" + cantidad);

            if (cantidad < 0) {
                throw new Exception("No se puede ingresar una cantidad negativa");
            }
            saldo = saldo + cantidad;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

