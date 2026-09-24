package juegos;

import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        final var añosPermitidos = 10;

        System.out.println("¿Tienes Mas De 10 Años?");
        var años = Integer.parseInt(consola.nextLine());

        System.out.println("¿Te Da Miedo La Oscuridad?");
        var oscuridad = Boolean.parseBoolean(consola.nextLine());


        if (años >= añosPermitidos && !oscuridad){

            System.out.println("Puedes Entrar");



        }else {

            System.out.println("No puedes entrar");
        }









    }
}
