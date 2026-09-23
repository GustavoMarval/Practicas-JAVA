
package persona; // Paso 5: Debe estar en el mismo paquete

import Persona.ClasePersona;

public class PruebaPersona {
    public static void main(String[] args) {

        // Probando la clase creando una nueva instancia mediante el constructor (Paso 2)
        ClasePersona persona1 = new ClasePersona("Gustavo", "Marval");

        // Obteniendo los valores mediante los métodos Get (Paso 4)
        System.out.println("Nombre inicial: " + persona1.getNombre());
        System.out.println("Apellido inicial: " + persona1.getApellido());

        // Modificando los valores mediante los métodos Set (Paso 4)
        persona1.setNombre("Carlos");
        persona1.setApellido("Perez");

        System.out.println("Nombre modificado: " + persona1.getNombre());
        System.out.println("Apellido modificado: " + persona1.getApellido());
    }
}