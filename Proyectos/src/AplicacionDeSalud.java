import java.util.Scanner;

public class AplicacionDeSalud {
    public static void main(String[] args) {

        System.out.println("*** Aplicacion De Salud Y Fitness");

        final var METAPASOSDIARIOS = 10000;
        final var CALORIASPORPASOS = 0.04; //Valor aproximado

        var consola = new Scanner(System.in);

        System.out.println("Nombre Del Usuario?");
        var nombreUsuarios = consola.nextLine();
        System.out.println("Cuantos Pasos diste hoy?");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        var metaAlcanzada = (pasosDiarios >= METAPASOSDIARIOS) ? "SI :)" : "NO :)";

        var caloriasQuemadas = pasosDiarios * CALORIASPORPASOS;

        System.out.printf("""
                
                
                %nUsuario: %s
                Pasos Dados Hoy: %d
                Calorias Quemadas: %.2f kcal
                Meta de pasos diarios alcanzadas: %s
                ------------------------------------------
                La meta de pasos diarios es de: %d pasos
                
                
                
                
                
                
                
                """,nombreUsuarios, pasosDiarios, caloriasQuemadas, metaAlcanzada, METAPASOSDIARIOS);






    }
}
