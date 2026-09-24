package utilidades;

import java.util.Scanner;

public class UsarSwitch {
    public static void main(String[] args) {
        System.out.println("*** DIA DE  LA SEMANA ***");

       var consola = new Scanner(System.in);
        var dia = Integer.parseInt(consola.nextLine());

        switch (dia){
            case 1:
                System.out.println("lunes");
                break;

            case 2:
                System.out.println("Martes");

                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;





        }


    }
}
