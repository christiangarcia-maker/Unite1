package unite1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// La primera nota del usuario.
		double nota1;
		
		// La segunda nota del usuario.
		double nota2;
		
		// La nota media del usuario.
		double media;
		
		// Pregunta sobre la primera nota al usuario.
		System.out.println("¿Cual es tu primera nota?");
		
		// Lee la primera nota.
		nota1 = ch.nextInt();
		
		// Pregunta sobre la segunda nota al usuario.
		System.out.println("¿Cual es tu segunda nota?");
		
		// Lee la segunda nota.
		nota2 = ch.nextInt();
		
		// Le da valor a la variable media mediante las dos notas.
		media = (nota1 + nota2)/2.0;
		
		// Imprime la media del usuario.
		System.out.println("Esta es tu nota media: " + media);
		
		// Cierre del escaner.
		ch.close();

	}

}
