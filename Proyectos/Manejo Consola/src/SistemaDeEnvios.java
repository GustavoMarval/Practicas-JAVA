import java.util.Scanner;

public class SistemaDeEnvios {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

       final var nacional = 10;
       final var internacional = 20;

        System.out.println("Opcion 1 Nacional || Opcion 2 Internacional");
       var Destino = Integer.parseInt(consola.nextLine());


        System.out.println("Peso Del Paquete en KG");
        var Peso = Integer.parseInt(consola.nextLine());




       switch (Destino){

           case 1:
               var costotal = Peso * nacional;
               System.out.println("El costo de tu envio es:" + costotal);
               break;

           case 2:
               var costotal2 = Peso * internacional;
               System.out.println("El costo de tu envio es:" + costotal2);
               break;


       }

    }




}
