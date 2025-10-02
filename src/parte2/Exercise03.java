package parte2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		Scanner ch = new Scanner(System.in);
		
		//Declaramos la variable donde se alamcena el primer número.
		int numero1;
		
		// Declaramos la variable donde se almacena el segundo número.
		int numero2;
		
		// Declaramos la variable donde se guarda el número que hay que sumarle para que el primer sea multiplo del segundo.
		int multiplo;
		
		// Preguntamos al usuario por el primer número.
		System.out.println("Introduce su primer número: ");
		numero1 = ch.nextInt();
		
		// Preguntamos al usuario por el segundo número.
		System.out.println("Introduce su segundo número: ");
		numero2 = ch.nextInt();
		
		// Inicializamos la variable con el siguiente ternario, para que si el resto sea 0, lo devuelva sin problemas.
		multiplo = numero1 % numero2 == 0 ? 0 : numero2 - numero1 % numero2;
		
		// Imprime el número que hay que sumarle al primero para que sea multiplo del segundo.
		System.out.println("El número que se ha de sumar para que sea multiplo es: " + multiplo);
		
		ch.close();

	}

}
