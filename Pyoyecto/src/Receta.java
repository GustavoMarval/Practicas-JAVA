import  java.util.Scanner;

public class Receta {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("Nombre de La Receta:");
        var Receta = consola.nextLine();
        System.out.println("Receta = " + Receta);

        System.out.println("Ingredientes de la receta:");
        var Ingredientes = consola.nextLine();
        System.out.println("Ingredientes = " + Ingredientes);

        System.out.println("Tiempo de preparaciom");
        var tiempodepreparacion = consola.nextDouble();
        System.out.println("tiempodepreparacion = " + tiempodepreparacion);

        System.out.println("Dificultad:");
        var dificultad = consola.nextLine();
        System.out.println("dificultad = " + dificultad);

        System.out.println("Receta = " + Receta);
        System.out.println("Ingredientes = " + Ingredientes);
        System.out.println("tiempodepreparacion = " + tiempodepreparacion);
        System.out.println("dificultad = " + dificultad);
    
    }
}
