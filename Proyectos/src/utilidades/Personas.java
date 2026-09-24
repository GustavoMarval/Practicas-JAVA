package utilidades;

public class Personas {
    String nombre;
    String apellido;

    void mostrarPersona(){

        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("Creacion De clases y objetos  personas");
        var objeto1 = new Personas();
        objeto1.nombre = "Layla";
        objeto1.apellido = "Acosta";
        objeto1.mostrarPersona();

        var objeto2 = new Personas();
        objeto2.nombre = "Ian";
        objeto2.apellido = "Gomez";
        objeto2.mostrarPersona();
    }


}
