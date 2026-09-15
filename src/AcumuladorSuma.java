public class AcumuladorSuma {
    public static void main(String[] args) {
        System.out.println("Suma Acumulativa");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        var numero = 1;
        while (numero <= MAXIMO){
            acumuladorSuma += numero++;
        }
        System.out.println(numero);
        System.out.println("Suma De Los Primeros " + MAXIMO + " Numeros " + acumuladorSuma);

    }

}
