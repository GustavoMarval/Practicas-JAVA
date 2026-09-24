package utilidades;

import java.util.Scanner;

public class LeerVariosTiposDeDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Edad:");
        var edad = consola.nextInt();

        System.out.println("edad = " + edad);


        System.out.println("Altura:");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
consola.nextLine();
        System.out.println("Ingresa Tu Nombre:");
        var nombre = consola.nextLine();

        System.out.println("nombre = " + nombre);

        System.out.println("Proporcione un valor entero");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt((enteroString));
        System.out.println("enteroString = " + enteroString);

        System.out.println("Proporciona un valor flotante:");
        var flotante = Float.parseFloat((consola.nextLine()));








    }
}
