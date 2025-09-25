package unite1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		//Almacena la edad del usuario.
		int edad;
		boolean mayorDeEdad;
		
		// Pregunta al usuario por su edad
		System.out.println("¿Cual es tu edad?: ");
		edad = ch.nextInt();
		
		// Se coloca la condición de tener 18 o más de 18 años.
		mayorDeEdad = edad >= 18;
		
		// Si es mayor de 18, imprimirá lo primero, si no, imprimirá lo segundo.
		System.out.println("¿Eres mayor de edad? " + mayorDeEdad);
		
		//Cierre del escaner
		ch.close();

	}

}
