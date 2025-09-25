package unite1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Creación del escaner
		Scanner ch = new Scanner(System.in);
		
		// Almacena el numero del usuario
		int numero;
		
		// Almacena si es true o falser
		boolean esPar;

		// Pregunta al usuario por un numero
		System.out.println("¿cCual es tu número?");
		numero = ch.nextInt();
		
		// Comprobamos si el numero es par
		esPar = numero%2 == 0;
		
		// Imprime true o false dependiendo del resultado
		System.out.println("¿El número es par? " + esPar);
		
		// Cierre del escaner
		ch.close();
	}

}
