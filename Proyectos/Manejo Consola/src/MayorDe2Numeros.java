import java.util.Scanner;

public class MayorDe2Numeros {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Numero 1:");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Numero 2:");
        var numero2 = Integer.parseInt(consola.nextLine());


        if (numero1 > numero2){
            System.out.println("Numero 1 es mayor");


        } else {

            System.out.println("Numero 2 es maryor");
        }

    }
}
