package parte2;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaramos la variable donde se almacenan los metros.
		double m;
		
		// Declaramos la variable donde se almacenan los centímetros.
		double cm;
		
		// Pregunta al usuario por el dato en metros.
		System.out.print("Introduce la longitud querida en metros: ");
		m = ch.nextDouble();
		
		// Pasamos los centímetros a metros.
		cm= m*100;
		
		// Casteamos la variable cm para que el resultado nos de unicamente la parte entera.
		cm = (int) cm;
		
		// Imprime la cantidad dada en centçimetros.
		System.out.print("Longitud en centímetros: " + cm + "cm");
		
		
		// Cierre del escaner.
		ch.close();

	}

}
