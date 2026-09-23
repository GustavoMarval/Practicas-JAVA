import java.util.Scanner;

public class EstacionDelAños {
    public static void main(String[] args) {

      var consola = new Scanner(System.in);



        System.out.println("Coloca el numero de mes");
        var numeroDeMes = Integer.parseInt(consola.nextLine());


        if (numeroDeMes == 1 || numeroDeMes == 2 || numeroDeMes == 12) {

            System.out.println("Epoca De Invierno");
        }else if (numeroDeMes == 3 || numeroDeMes == 4 ||numeroDeMes == 5) {

            System.out.println("Primavera");

        }else if (numeroDeMes == 6 || numeroDeMes == 7 ||numeroDeMes == 8) {


            System.out.println("Verano");

    }else if (numeroDeMes == 9 || numeroDeMes == 10 ||numeroDeMes == 11) {


            System.out.println("Otoño");
        } else if (numeroDeMes > 12) {

            System.out.println("Coloca otro numero");

        }
    }
}
