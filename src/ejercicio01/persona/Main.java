package ejercicio01.persona;

public class Main {

    public static void main(String[] args) {

        // Instanciamos dos objetos de la clase Persona
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        // Asignamos valores directamente
        persona1.nombre = "Juan";
        persona1.edad = 25;

        persona2.nombre = "María";
        persona2.edad = 30;

        // Imprimimos los datos usando el operador punto (.)
        System.out.println("Persona 1:");
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);

        System.out.println();

        System.out.println("Persona 2:");
        System.out.println("Nombre: " + persona2.nombre);
        System.out.println("Edad: " + persona2.edad);
    }
}