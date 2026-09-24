package utilidades;

import java.util.Scanner;

public class DibujarTriangulo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Proporciona el numero de filas: ");
        var numeroFilas = consola.nextInt();


        for (var fila = 1; fila <= numeroFilas; fila ++){
            var espaciosBlancos = " ".repeat(numeroFilas- fila);
            var asteriscos = "*" .repeat(2 * fila -1);
            System.out.println(espaciosBlancos + asteriscos);

        }

    }
}
