package juegos;

import java.util.Random;


public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("Numeros Aleatorios");

        var radom = new Random();
         var numero = radom.nextInt();
        System.out.println("numero = " + numero);
        var numeros = radom.nextInt(10) + 1;
        System.out.println("numero = " + numeros);
    }
}
