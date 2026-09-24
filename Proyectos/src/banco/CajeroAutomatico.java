package banco;

import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {
        System.out.println("*** Cajero Automatico ***");

        var consola = new Scanner(System.in);
        var salir = false;
        var saldo = 0;

        while (!salir) {
            System.out.println("""

                    *** Operaciones que puedes realizar ***

                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    """);

            var opcion = leerEntero(consola, "Elige una opcion: ");

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es de: " + saldo);
                    break;

                case 2:
                    var retiro = leerEntero(consola, "Cuanto deseas retirar? ");
                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor a cero.");
                    } else if (retiro > saldo) {
                        System.out.println("No tiene fondos suficientes.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso, tu saldo actual es de: " + saldo);
                    }
                    break;

                case 3:
                    var deposito = leerEntero(consola, "Monto del deposito: ");
                    if (deposito <= 0) {
                        System.out.println("El monto debe ser mayor a cero.");
                    } else {
                        saldo += deposito;
                        System.out.println("El total de su cuenta es de: " + saldo);
                    }
                    break;

                case 4:
                    salir = true;
                    System.out.println("Gracias por usar el cajero. Hasta pronto.");
                    break;

                default:
                    System.out.println("Opcion invalida, intenta de nuevo.");
            }
        }

        consola.close();
    }

    /**
     * Lee un numero entero desde la consola, repitiendo la pregunta
     * hasta que el usuario ingrese un valor valido (evita que el
     * programa se caiga si escriben texto en vez de un numero).
     */
    private static int leerEntero(Scanner consola, String mensaje) {
        while (true) {
            System.out.println(mensaje);
            if (consola.hasNextInt()) {
                var valor = consola.nextInt();
                consola.nextLine();
                return valor;
            } else {
                System.out.println("Eso no es un numero valido, intenta de nuevo.");
                consola.nextLine();
            }
        }
    }
}