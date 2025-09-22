package unite1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Creación de la variable nota1.
		double nota1;
		
		// Creación de la variable nota2.
		double nota2;
		
		// Creación de la variable media.
		double media;
		
		// Pregunta sobre la primera nota.
		System.out.println("¿Cual es tu primera nota?");
		
		// Lee la primera nota.
		nota1 = ch.nextInt();
		
		// Pregunta sobre la segunda nota.
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
