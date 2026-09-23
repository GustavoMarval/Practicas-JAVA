public class FormateoDeCadenas {

    public static void main(String[] args) {
var nombre = "Matias";
var edad = 12;
double salario = 2000.20;


var mensaje = String.format("Nombre: %s, Edad: %d, salario: $%.2f", nombre, edad, salario);

        mensaje = """
                %nDetalle Persona:
                
                
                \tNombre: %s
                \t edad: %d
                \t salario: $%.2f
                
                
                """.formatted(nombre, edad , salario);
        System.out.println(mensaje);

    }
}
