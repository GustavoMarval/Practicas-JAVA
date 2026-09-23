import java.util.Scanner;

public class Operadorand {
    public static void main(String[] args) {
        System.out.println("Valor dentro del rango");

        final var minimo = 0;
        final var maximo = 5;

        System.out.println("Proporciona un valor entre 1 y 5");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());

        var estaDentroDelRango = dato >= minimo && dato <= maximo;

        System.out.println("estaDentroDelRango = " + estaDentroDelRango);










    }
}
