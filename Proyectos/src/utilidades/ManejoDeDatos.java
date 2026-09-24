package utilidades;

import java.util.Scanner;

public class ManejoDeDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("consola  ");


        var nombre = consola.nextLine();

        System.out.println("nombre = " + nombre);
    }
}
