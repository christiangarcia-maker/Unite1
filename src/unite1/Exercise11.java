package unite1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Almacena los euros
		double euros;
		
		// Almacena las pesetas
		double pesetas;
		
		// Pregunta por las pesetas al usuario
		System.out.println("¿Cuantas pesetas tienes? ");
		pesetas = ch.nextInt();
		
		euros = pesetas / 166;
		
		System.out.println("Tienes " + euros + " euros");
		// Cierre del escaner.
		ch.close();
		

	}

}
