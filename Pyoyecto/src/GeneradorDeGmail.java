import java.util.Scanner;

public class GeneradorDeGmail {
    public static void main(String[] args) {



    //Nombre Completo Del Usuario

        var consola = new Scanner (System.in);
        System.out.println("Cual Es Tu Nombre: ");
        var nombreCompleto = consola.nextLine();
    System.out.println("nombreCompleto = " + nombreCompleto);

    var nombreNormalizado = nombreCompleto.strip();
    nombreNormalizado= nombreCompleto.replace(" ", ".");

    nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

var nombreEmpresa = " Global Mentoring";
        System.out.println("\nnombreEmpresa = " + nombreEmpresa);
        var extensionDominio = ".com.mx";
        System.out.println("extensionDominio = " + extensionDominio);

var nombreEmpresanormalizado = nombreEmpresa.strip().replace(" ",".").toLowerCase();
var dominioemailnormalizado = "@" + nombreEmpresanormalizado + extensionDominio;
        System.out.println("dominioemailnormalizado = " + dominioemailnormalizado);

        var gmail = nombreEmpresanormalizado + dominioemailnormalizado;
        System.out.println("gmail = " + gmail);
    }
}
