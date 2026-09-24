import java.util.Scanner;

public class IteradorDeCuentas {
    public static void main(String[] args) {
        System.out.println("***Menu Iterativo***");
        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir) {

            System.out.println("""
                    ***Sistema de Administracion de Cuentas ***
                    
                    Menu:
                    1. Crear Cuenta
                    2. Eliminar Cuenta
                    3. Salir
                    Escoje una opcion \s
                    
                    
                    """);

            var opcion = consola.nextInt();
            switch (opcion) {

                case 1 -> System.out.println("Creando Tu Cuentas \n");
                case 2 -> System.out.println("Eliminar cuenta \n");
                case 3 -> {
                    System.out.println("Saliendo Del Sistema");
                    salir = true;

                    break;
                }


            }


        }

    }


}


