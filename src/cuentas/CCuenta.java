package cuentas;


/** 
 * Clase encargada de gestionar las cuentas de los clientes de banco.
 * @author Rocío Decuzzi Fernández
 * @version 1.1
 * @since 24/05/2024
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de la cuenta.
     * @param sal Saldo inicial.
     * @param tipo Tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método que devuelve el saldo de la cuenta.
     * @return saldo de la cuenta.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método para realizar un retiro de la cuenta.
     * @param cantidad La cantidad a retirar de la cuenta.
     */
    public void retirar(double cantidad) {
        try {
            System.out.println("Retiro en cuenta:" + cantidad);
            if (cantidad <= 0) {
                throw new Exception("No se puede retirar una cantidad negativa");
            }
            if (estado() < cantidad) {
                throw new Exception("No se hay suficiente saldo");
            }
            setSaldo(getSaldo() - cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Método para ingresar saldo en la cuenta.
     * @param cantidad La cantidad a ingresar en la cuenta.
     */
    public void ingresar(double cantidad) {
        try {
            System.out.println("Ingreso en cuenta:" + cantidad);

            if (cantidad < 0) {
                throw new Exception("No se puede ingresar una cantidad negativa");
            }
            setSaldo(getSaldo() + cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Métodos getters y setters con JavaDoc
    /**
     * Devuelve el titular de la cuenta
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el titular a la cuenta
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de la cuenta.
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta.
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo a la cuenta.
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés a la cuenta.
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés a la cuenta.
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

