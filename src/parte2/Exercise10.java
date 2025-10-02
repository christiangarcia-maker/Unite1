package parte2;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
	
		// Declaramos la variable donde se almacena el año.
		int year;
		
		// Declaramos la variable donde se alamcena el siglo perteneciente.
		int siglo;
		
		// Pregunta al usuario el año que quiere.
		System.out.print("Introduzca un año: ");
		year = ch.nextInt();
		
		// Divide el año en dos para tomar los dos primeros números y le suma 1 para guardar así el siglo correctamente.
		siglo = year / 100 + 1;
	
		// Imprime el siglo al que pertenece.
		System.out.println("Este año pertenece al siglo " + siglo);
		
		// Cierre del escaner.
		ch.close();

	}

}
