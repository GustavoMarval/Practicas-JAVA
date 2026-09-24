package cadenas;

public class SubCadena {
    public static void main(String[] args) {
        // Tema de Subcadena
        var cadena1 = "Hola MUndo";
        System.out.println("cadena1 = " + cadena1);

        var subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);

        var subcadena2 = cadena1.substring(5,10);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
