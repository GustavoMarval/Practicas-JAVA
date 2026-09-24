import java.util.Scanner;

public class SistemaDeBanco {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Desea Salir Del Sistema (True/False)");
        var salirSistema =Boolean.parseBoolean((consola.nextLine()));

        if(!salirSistema){
            System.out.println("Continuamos Dentro Del Sistema");
        }else {

            System.out.println("Saliendo Del Sistema");
        }







    }
}
