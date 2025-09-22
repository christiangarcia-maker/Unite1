package unite1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creamos nuestro escaner.
		Scanner ch = new Scanner(System.in);
		
		// Creamos la vaiable edad.
		int edad;
		//Creamos la variable edad1.
		int edad1;
		
		// Preguntamos al usuario su edad.
		System.out.println("¿Cual es tu edad?:");
		
		// Lee el numero.
		edad = ch.nextInt();
		
		// Colocamos un valor a edad1, la cual es la suma de 1 a la variable de edad.
		edad1 = edad + 1;
		
		// Imprime la edad que tendrá el usuario dentro de un año.
		System.out.println("En un año tendrás " + edad1);
		
		ch.close();

	}

}
