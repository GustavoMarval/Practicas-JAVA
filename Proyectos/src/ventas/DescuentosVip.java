package ventas;

import java.util.Scanner;

public class DescuentosVip {
    public static void main(String[] args) {

        System.out.println("Sistema De Descuentos VIP");
        final var NO_PRODUCTOS_DESCUENTOS = 10;
        var consola = new Scanner(System.in);


        System.out.println("¿Cuantos Productos Compraste Hoy?");
        var cantidadDeProductos = Integer.parseInt(consola.nextLine());

        System.out.println("¿Tienes La Membresia de la tienda?");
        var tienesMenbresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadDeProductos >= NO_PRODUCTOS_DESCUENTOS && tienesMenbresia;

        System.out.println("¿Tienes Acceso Al Descuento VIP? = " + esElegibleDescuento);





    }
}
