package utilidades;

import java.util.Scanner;

public class RecetasDeCocina {
    public static void main(String[] args) {
        System.out.println(" Recetas De Cocina ");
        var consola = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la receta:");
        var nombreReceta = consola.nextLine();


        System.out.println("Ingresa los ingredientes");
        var ingredientes = consola.nextLine();

        System.out.println("Tiempo De Preparacion:");
        var tiempoDepreparacion = Integer.parseInt(consola.nextLine());

        System.out.println("Dificultad");
        var dificultad = consola.nextLine();

        System.out.println("nombreReceta = " + nombreReceta);
        System.out.println("ingredientes = " + ingredientes);
        System.out.println("tiempoDepreparacion = " + tiempoDepreparacion);
        System.out.println("dificultad = " + dificultad);







    }
}
