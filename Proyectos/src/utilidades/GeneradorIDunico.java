package utilidades;

import java.util.Random;
import java.util.Scanner;

public class GeneradorIDunico {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var random = new Random();

        System.out.println("**** Bienvenido Generador de ID Unico ***");

        System.out.println("Cual es tu nombre:");
        var nombre = consola.nextLine();

        System.out.println("Cual es tu Apellido:");
        var apellido = consola.nextLine();

        System.out.println("Cuando naciste:");
        var fecha_de_nacimiento = consola.nextLine();

        var subNombre = nombre.trim().substring(0,2).toUpperCase();
        var subApellido = apellido.trim().substring(0,2).toUpperCase();
        var subaños = fecha_de_nacimiento.substring(2,4);

        var numeroAleatorio = random.nextInt(9999) + 1;
        var aleatorio = String.format("%04d", numeroAleatorio);

        System.out.println(subNombre + subApellido + subaños + aleatorio);







    }
}
