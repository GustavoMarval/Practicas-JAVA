import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        var random = new Random();




        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        var flotante = random.nextFloat();
        System.out.println("flotante = " + flotante);

        var dado = random.nextInt(6) + 1;
        System.out.println("dado = " + dado);









    }
}
