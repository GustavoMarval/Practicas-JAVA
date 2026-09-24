package utilidades;

import java.util.Scanner;

public class ValidacionDeContraseña {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);


int liminite = 7;


        var salir = false;

        while (!false){
            System.out.println("Validacion de passwor");

            System.out.println("""
                    1.Crear contraseña
                    2.Salir
                    
                    Elije a una opcion:
                    """);


            var opcione = consola.nextInt();
            consola.nextLine();

            switch (opcione){

                case 1:

                    System.out.println("Ingresa Maximo 6 caracteres");
                    var contraseña = consola.nextLine();

                    if (contraseña.length() > 0 && contraseña.length() <= 6  ){
                        System.out.println("✅ Contraseña creada con éxito: " + contraseña);





                    }else {
                        System.out.println(" Error: La contraseña no debe pasar de 6 caracteres (ni estar vacía).");
                    }
                case 2:
                    System.out.println("saliendo");
                    salir = true;


            }


        }
    }
}
