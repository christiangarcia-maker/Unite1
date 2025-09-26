package unite1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creación del scanner.
		Scanner ch = new Scanner(System.in);
	
		// Almacena el numero del usuario.
		int numero;

		// Pregunta al usuario un numero.
		System.out.println("Introduce un numero:");
		
		// Lee el numero.
		numero = ch.nextInt();
		
		// Imprime el numero del usuario.
		System.out.println("Tú numero es: " + numero);
		
		// Cierre del escaner.
		ch.close();
	}

}
