import java.util.Scanner;

public class LeerDatos {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.println("Ingresa la edad");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        System.out.println("ingresa Altura");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);



    }
}
