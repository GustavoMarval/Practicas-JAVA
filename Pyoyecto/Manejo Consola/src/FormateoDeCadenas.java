public class FormateoDeCadenas {
    public static void main(String[] args) {

        System.out.println("Formateo de cadenas");
        var nombre = "Matias";
        var edad = 35;
        var salario = 21000.50;

        var mensaje = String.format("Nombre: %s Edad %d salario %.2f", nombre, edad, salario);
        System.out.println(mensaje);

        mensaje = """
                %nDetalle Persona:\s
                --------------------
                \tNombre: %s
                \tEdad: %d años
                \t Salario: %f
                
                
                
                
                
                
                
                """.formatted(nombre,edad,salario);
        System.out.println(mensaje);








    }
}
