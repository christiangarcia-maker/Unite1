package unite1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creamos nuestro escaner.
		Scanner ch = new Scanner(System.in);
		
		// Creamos la variable nota1.
		int nota1;
		
		// Creamos la variable nota2.
		int nota2;
		
		int media;
		
		System.out.println("¿Cual es tu primera nota?");
		nota1 = ch.nextInt();
		
		System.out.println("¿Cual es tu segunda nota?");
		nota2 = ch.nextInt();
		
		media = (nota1 + nota2)/2;
		
		System.out.println("Esta es tu nota media: " + media);
		
		ch.close();

	}

}
