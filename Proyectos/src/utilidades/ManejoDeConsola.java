package utilidades;

import java.util.Scanner;

public class ManejoDeConsola {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.println("Escribe tu nombre");

    var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

    }
}
