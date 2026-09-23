import java.util.Scanner;

public class FuncionPar {
    static boolean esPar(int numero) {

            return (numero % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println("Porporciona un numero:");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Tu numero es par?" + esPar(numero));

    }

    }

