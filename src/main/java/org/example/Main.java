package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persona persona1 = new Persona();
        persona1.setNombre("Andrés Alonso");
        persona1.setApellido("Carrasco Martínez");
        persona1.setEdad(20);
        persona1.setNacionalidad(new String[]{"peruano", "estadounidense"});

        String nombre = persona1.getNombre();
        String apellido = persona1.getApellido();
        int edad = persona1.getEdad();
        String nacionalidad[] = persona1.getNacionalidad();
        String mensaje = "Hola, soy "+nombre+" "+apellido+" y tengo "+edad+", mi nacionalidad es: "+nacionalidad[0]+"-"+nacionalidad[1];
        System.out.println(mensaje);
    }
}