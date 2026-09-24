package utilidades;

import java.util.Scanner;

public class RangoDeUnaVariable {
    public static void main(String[] args) {
        var consala = new Scanner(System.in);

        System.out.println("Propocione Un Dato Entero");
        var dato = Integer.parseInt(consala.nextLine());

        var estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("estaDentroRango = " + estaDentroRango);

        var estaFueraDelRango =  !(dato >= 1 && dato <= 10);
        System.out.println("estaFueraDelRango = " + estaFueraDelRango);



    }
}
