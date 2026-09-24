package utilidades;

import java.util.Scanner;

public class SistemaDeAutenticacion {
    public static void main(String[] args) {

        final var UsuarioAdmin = "admin";
        final var password = "123";

        var consola = new Scanner(System.in);

        System.out.println("¿Cual Es Tu Usuario?");
        var usuarioIngresado = consola.nextLine();

        System.out.println("Cual es tu contraseña?");
        var contraseña = consola.nextLine();

        var sonDatoscorrectos = usuarioIngresado.equals(UsuarioAdmin)
                && password.equals(contraseña);

        System.out.println("sonDatoscorrectos = " + sonDatoscorrectos);
        




        






    }
}
