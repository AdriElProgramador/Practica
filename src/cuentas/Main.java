package cuentas;

/**
 * @author Alguien
 * @version 1.0
 * @since 1.0
 */
public class Main {

    /**
     * Método main del proyecto
     * @param args 
     */
    public static void main(String[] args) {
        operativa_cuenta(2500);
    }

    /**
     * Crea un objeto cuenta y llama a varios de sus métodos para demostrar su funcionamiento
     * @param cantidad 
     */
    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidad,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
