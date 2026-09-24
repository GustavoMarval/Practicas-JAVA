package ventas;

import java.util.Scanner;

public class SistemaDeEmpleados {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Nombre Del Empleado");
        var Nombre = consola.nextLine();
        System.out.println("Nombre = " + Nombre);
        System.out.println("Edad");
        var Edad = consola.nextInt();
        System.out.println("Edad = " + Edad);
        System.out.println("salario");
        var salario = consola.nextDouble();
        System.out.println("salario = " + salario);
        System.out.println("jefe");
        var   Jefe= consola.nextBoolean();
        System.out.println("Jefe = " + Jefe);

    }
}
