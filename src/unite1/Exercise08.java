package unite1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Almacena el nombre del usuario.
		String nombre;
		
		// Almacena la edad del usuario.
		int edad;
		
		// Pregunta al usuario por su nombre.
		System.out.println("¿Como te llamas?: ");
		nombre = ch.nextLine();
		
		// Pregunta al usuario por su edad.
		System.out.println("¿Cual es tú edad?: ");
		edad = ch.nextInt();
		
		// Imprime la siguiente frase.
		System.out.println("Hola " + nombre + ", tienes " + edad + " años,¡qué mayor eres!");
	}

}
