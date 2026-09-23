import java.util.Scanner;

public class Generaciondeticketdeventa {
    public static void main(String[] args) {

        System.out.println("Generacion ticked de venta ");

        var consola = new Scanner(System.in);

        System.out.println("Precio Del Producto: ");
        var PrecioLeche = Double.parseDouble(consola.nextLine());

        System.out.println("Precio Pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.println("Precio Lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());


        System.out.println("Precio Platano: ");
        var precioPlatano = Double.parseDouble(consola.nextLine());

        var subtotal = precioLechuga + precioPan + precioPlatano;

        var impuesto = subtotal * 0.16;

        var costoTotalCompra = subtotal + impuesto;

        System.out.println("costoTotalCompra = " + costoTotalCompra);






    }
}
