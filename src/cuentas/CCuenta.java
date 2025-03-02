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


    public CCuenta()
    {
    }

    /**
     * Crea una objeto cuenta con el nombre, número de cuenta, saldo y tipo de interés indicado.
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Cambia el nombre de la cuenta
     * @param nom 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * @return el nombre de la cuenta
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * @return el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = getSaldo() + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = getSaldo() - cantidad;
    }


    public String obtenerCuenta()
    {
        return getCuenta();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getTipoInterés() {
        return tipoInterés;
    }


    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    public String getCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }
}
