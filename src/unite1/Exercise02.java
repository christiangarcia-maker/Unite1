package unite1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Almacena la edad del usuario.
		int edad;
		
		// Almacena la edad que tendrá dentro de 1 año.
		int edadProximoAño;
		
		// Preguntamos al usuario su edad.
		System.out.println("¿Cual es tu edad?:");
		
		// Lee el numero.
		edad = ch.nextInt();
		
		// Coloca un valor a edadProximoAño, la cual es la suma de 1 a la variable de edad.
		edadProximoAño = edad + 1;
		
		// Imprime la edad que tendrá el usuario dentro de un año.
		System.out.println("En un año tendrás " + edadProximoAño);
		
		ch.close();

	}

}
