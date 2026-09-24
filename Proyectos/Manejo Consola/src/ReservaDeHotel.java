import java.util.Scanner;

public class ReservaDeHotel {

    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        var cuartoConVistaAlMar = 190.50;
        var cuartoSinVistaAlMar = 150.50;



        System.out.println("***RESERVACION DE HOTEL***");

        System.out.println("¿Cual Es Su Nombre?");
        var nombreCliente = consola.nextLine();


        System.out.println("Dias De Estadia:");
        var diasDeEstancia = Integer.parseInt(consola.nextLine());

        System.out.println("¿La habitacion es con vista al Mar?");
        var vistaAlMar = Boolean.parseBoolean(consola.nextLine());

        var costoTotal = 0.0;
        if (vistaAlMar) {
            costoTotal = diasDeEstancia * cuartoConVistaAlMar;
        }else {
            costoTotal = diasDeEstancia *cuartoSinVistaAlMar;
        }

        System.out.printf("""
                
                %nNombre: %s
                Dias De Estadia: %d
                Costo Total: %.2f
                
                
                
                """,nombreCliente,diasDeEstancia, costoTotal);








    }
}
