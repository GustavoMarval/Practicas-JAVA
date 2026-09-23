import java.util.Scanner;

public class CalculoDeUnRectangulo {

    public static void main(String[] args) {
        System.out.println("Calculo de un rectangulo");

        var consola = new Scanner(System.in);

        System.out.println("¿Base Del Rectangulo?");
        var base = Integer.parseInt(consola.nextLine());

        System.out.println("¿Altura Del Rectangulo?");
        var Altura = Integer.parseInt(consola.nextLine());

        var perimetro = 2 * (base + Altura);
        System.out.println("perimetro = " + perimetro);








    }
}
