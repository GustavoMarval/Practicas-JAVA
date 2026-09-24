

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        var aritmetica1 = new Aritmetica(5, 7);
        System.out.println("Atributo 1:" + aritmetica1.getOperando1());
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);
        aritmetica1.sumar();
        aritmetica1.restar();
        // Creamos un segundo objeto
        System.out.println("Atributo 2:" + aritmetica1.getOperando2());
        var aritmetica2 = new Aritmetica(12, 16);
        aritmetica2.sumar();
    }
}