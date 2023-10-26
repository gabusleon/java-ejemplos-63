package ec.edu.ups.ejemplo.uno.test;

import java.util.Scanner;

import ec.edu.ups.ejemplo.uno.clases.Persona;

public class Principal {

   public static void main(String[] args) {
       Persona juanitoPerez;
       juanitoPerez = new Persona();
       //juanitoPerez.nombre = "ERES JUANITO";
       juanitoPerez.setNombre("JUANITO");
       System.out.println(juanitoPerez.getNombre());
       
       Persona personaUno  = new Persona();      
       /*
       personaUno.numeroCedula = "0101";
       personaUno.nombre = "Otra persona";
       personaUno.apellido = "Mi apellido";
       */
       
       //System.out.println(personaUno.numeroCedula + " " + personaUno.nombre + " " + personaUno.apellido);
       
       Persona personaDos = new Persona("010101", "Pepito", "Perez");
       System.out.println(personaDos.getNumeroCedula());
       personaDos.setNumeroCedula("020202");
       System.out.println(personaDos.getNumeroCedula());
       
       System.out.println(personaDos);
       //Manejo de la clase Scanner
       Scanner entrada = new Scanner(System.in);
       //Leemos un texto por teclado
       String nombre = entrada.next();
       //Mostramos el texto leido concatenando con la palabra "Hola"
       System.out.println("Hola, " + nombre);
       //Instanciamos un nuevo objeto denominado personita
       Persona personita = new Persona();
       //Asignamos el valor leído por teclado y asignado a la variable nombre
       //en el atributo nombre del objeto personita
       personita.setNombre(nombre);
       //Mostramos los datos del objeto personita a través del método toString()
       System.out.println(personita.toString());
       
       //Manejo de la clase Date
       
       
   }
}
