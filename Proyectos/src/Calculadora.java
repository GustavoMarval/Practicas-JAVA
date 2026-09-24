import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;






        while (!salir){

            System.out.println("Dime un Numero\n");
            var numero1 = consola.nextDouble();
            System.out.println("Dime otro\n");
            var numero2 = consola.nextDouble();
            System.out.println("""
                        
                        ¿Que quieres hacer?
                        
                        1.Suma
                        2.Resta
                        3.Multipliacion
                        4.Divicion
                        5.Salir
                        
                        
                        """);
            var opciones = consola.nextInt();
            switch (opciones){




                case 1:
                    System.out.println("Resultado Suma:" + numero1 + numero2);

                    break;
                case 2:
                    System.out.println("Resultado resta:" );
                    System.out.println( numero1 - numero2);
                    break;

                case 3:
                    System.out.println("Resultado Multiplicacion:" + numero1 * numero2);
                    break;
                case 4:
                    System.out.println("Resultado Divicion:" + numero1 / numero2);
                    break;
                case 5:
                    salir = true;
            }
        }




    }
}
