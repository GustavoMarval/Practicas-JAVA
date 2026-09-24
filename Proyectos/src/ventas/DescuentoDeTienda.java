package ventas;

import java.util.Scanner;

public class DescuentoDeTienda {
    public static void main(String[] args) {

        final var MontoCompraDescuento = 1000.00;

        var consola = new Scanner(System.in);

        System.out.println("Tienda En Linea");





        System.out.println("De cuantos $ es tu Compra?");
        var montoDeCompra = Double.parseDouble(consola.nextLine());

        System.out.println("Eres Miembro De La Tienda?");
        var mienbroDeTienda = Boolean.parseBoolean(consola.nextLine());

        var descuento = 0.0;



        if (montoDeCompra >= MontoCompraDescuento && mienbroDeTienda) {


            descuento = 0.10;

        }else if (mienbroDeTienda) {

            descuento = 0.05 ;

        } else {

            descuento = 0;

        }

        if(descuento != 0){

            var montoDescuento = montoDeCompra * descuento;
            var montoFinal =  montoDeCompra - montoDescuento;

            System.out.printf("""
                    
                    %nFelicidades!, has optenido un descuento del %.0f%%
                    
                    Monto de la Compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra: $%.2f%n
                    
                    
                    
                    
                    
                    
                    """, descuento * 100, montoDeCompra, montoDescuento, montoFinal);
        }else {

            System.out.printf("""
                    
                    
                    
                    %n Te Invitamos hace miembro de la tienda
                    Monto de la Compra: $%.2f%n
                    
                    
                    """, montoDeCompra);
        }


    }
}
