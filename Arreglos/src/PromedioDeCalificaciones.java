import java.util.Scanner;

public class PromedioDeCalificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Cuantas calificaciones quieres agregar?");
        var calificacionesparaagregar = Integer.parseInt(consola.nextLine());
        var calificaciones = new int [calificacionesparaagregar];


        for (var i = 0; i < calificacionesparaagregar; i++){
            System.out.println("Dime las notas de tus califiaciones :");
            calificaciones[i] = Integer.parseInt(consola.nextLine());

        }
        double suma = 0 ;
        System.out.println("Notas Ingresadas");
        for (var i = 0; i < calificacionesparaagregar; i++) {
            System.out.println("Arreglo numero; " + i + "contenido arreglo: " + calificaciones[i]);
            suma += calificaciones[i];



        }
        double promedio = suma / calificacionesparaagregar;
        System.out.println("Tu promedo es de:" + promedio);

    }
}
