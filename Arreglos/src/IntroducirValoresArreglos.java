import java.util.Scanner;

public class IntroducirValoresArreglos {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("Proporciona el largo del arreglo");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        var enteros = new int [largoArreglo];

        for (var i = 0; i < largoArreglo; i++){
            System.out.println("Proporciona enteros["+ i +"] =");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
for (var i = 0; i < largoArreglo; i++){
    System.out.println("Arreglo numero; " + i + "contenido arreglo: " +enteros[i]);
}

    }
}
