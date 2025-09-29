package parte2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaramos la variable donde se almacena el número entero del usuario.
		int numero;
		
		// Pregunta al usuario por un número entero.
		System.out.println("Coloca un número entero: ");
		numero = ch.nextInt();
		
		numero = 7 - numero % 7;
		
		System.out.println(numero);
	}

}
