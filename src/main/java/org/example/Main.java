package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persona persona1 = new Persona();
        persona1.setNombre("Andrés Alonso");
        persona1.setApellido("Carrasco Martínez");
        persona1.setEdad(20);
        persona1.setNacionalidad(new String[]{"peruano", "estadounidense"});
        System.out.println(persona1);
        System.out.println("¡Hola!");
    }
}