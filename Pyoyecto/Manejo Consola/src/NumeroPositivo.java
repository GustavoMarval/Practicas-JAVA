import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {

        System.out.println("Revisor De Numeros");

        var consola = new Scanner(System.in);

        System.out.println("Coloca un numero");
        var numero = Integer.parseInt(consola.nextLine());

        if (numero > 0){
            System.out.println("Tu numero es positivo");



        } else if (numero < 0) {
            System.out.println("Es negativo");




        } else {
            System.out.println("Es 0");
        }

    }
}
