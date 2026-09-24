import java.util.Scanner;

public class SistemadeEmpleados {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.println("Nombre Empleado:");
        var Empleado = consola.nextLine();
        System.out.println("Nombre Del Empleado = " + Empleado);

        consola.nextLine();

        System.out.println(" EDAD: " );

var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        consola.nextLine();

        System.out.println(" Salario: " );

        var salario = consola.nextDouble();
        System.out.println("salario = " + salario);









    }
}
