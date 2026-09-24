package ventas;

import java.util.Scanner;

public class PrestamoDeLibros {
    public static void main(String[] args) {

        final var DistanciaPermitida = 3;

        var consola = new Scanner(System.in);


        System.out.println("Cuaentas Con Credencial De Estudiante ?");
        var tienescredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.println("¿Acuantos KM Vives de la biblioteca?");
        var KM_Biblioteca = Integer.parseInt(consola.nextLine());

        var Limite = tienescredencial || KM_Biblioteca <= DistanciaPermitida;

        System.out.println("Limite = " + Limite);


    }
}
