package cuentas;

/**
 * @author Alguien
 * @version 1.0
 * @since 1.0
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Crea un objeto cuenta con sus variables vacias
     */
    public CCuenta() {
    }

    /**
     * Crea una objeto cuenta con el nombre, número de cuenta, saldo y tipo de
     * interés indicado
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Cambia el nombre de la cuenta
     *
     * @param nom
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * @return el nombre de la cuenta
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * @return el saldo de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Añade la cantidad indicada al saldo de la cuenta, lanza error si se
     * intenta ingresar una cantidad negativa
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = getSaldo() + cantidad;
    }

    /**
     * Resta la cantidad indicada al saldo de la cuenta, lanza error si se
     * intenta retirar una cantidad negativa o una cantidad mayor al saldo de la
     * cuenta
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = getSaldo() - cantidad;
    }

    /**
     * @return el número de cuenta
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     * @return el nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre de la cuenta
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Cambia el tipo de interés de la cuenta
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @return el número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }
}
