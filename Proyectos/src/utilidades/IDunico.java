package utilidades;

import java.util.Scanner;
import java.util.Random;

public class IDunico {

    public static void main(String[] args) {
        System.out.println("Bienvenidos ID unico");

        var consola  = new Scanner(System.in);
        var aleatorio = new Random ();

        System.out.println("Cual es tu Nombre?");
        var nombre = consola.nextLine();

        System.out.println("Cual es tu Apellido?");
        var apellido = consola.nextLine();

        System.out.println("Cual es tu Nacimiento?");
        var nacimiento = consola.nextLine();

        var nombre2 = nombre.trim().toUpperCase().substring(0, 2);
        var apellido2 = apellido.trim().toUpperCase().substring(0, 2);
        var nacimiento2 = nacimiento.trim().toUpperCase().substring(2);


        var numeroaleatorio = aleatorio.nextInt(9999) + 1;

        var formatodenumeroaleatorio = String.format("%04d", numeroaleatorio);



        var idunico = nombre2 + apellido2 + nacimiento2 + formatodenumeroaleatorio;

        System.out.printf("""
                %nHola %s,
                
                \t Tu nuevo ID es:
                \t %s
                \t Felicidades
                
                
                """, nombre, idunico);


    }
}
