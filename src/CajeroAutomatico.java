import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("*** Cajero Automatico ***");

        var consola = new Scanner(System.in);

        var salir = false;
        var saldo = 0;


        while (!salir){
            System.out.println("""
                    
                    *** Operaciones que puedes realizar ***
                    
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. salir
                    
                    
                    
                    
                    
                    """);
            var opciones = consola.nextInt();


            switch (opciones){
                case 1:
                    System.out.println("Su saldo Es De: " + saldo );

                    break;

                case 2:
                    System.out.println("Cuanto Deseas Retirar?");
                    var retiro = consola.nextInt();
                    if (saldo < retiro ){

                        System.out.println("no tiene fondos");


                    }else if (saldo >= retiro) {
                        System.out.println("Retiro exitoso, tu saldo actual es de:");
                    System.out.println( saldo -= retiro);

                }
                    break;

                case 3:

                    System.out.println("Monto Del Deposito:" );
                    var Deposito = consola.nextInt();

                    saldo += Deposito;
                    System.out.println("El total de su cuenta es de: " + saldo);






                    break;

                case 4 :
                    salir = true;

                    break;



            }

        }


    }
}
