package parte2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaramos la variable donde se almacena el número entero del usuario.
		int numero;
		
		// Declaramos la variable donde se almacenará el numero que ha de sumar para que sea multiplo de 7.
		int numeroASumar;
		
		// Pregunta al usuario por un número entero.
		System.out.println("Coloca un número entero: ");
		numero = ch.nextInt();
		
		// Realizamos el siguiente ternario, esto lo hacemos para que nos devuelva el numero correspondiente, y si es cero, devuelva cero.
		numeroASumar = numero % 7 == 0 ? 0 : 7 - numero % 7;
		
		// Imprime el número que ha de sumar para que sea multiplo de 7.
		System.out.println("Para que sea multiplo de 7 ha de sumarle : " + numeroASumar);
		
		// Cierre del escaner.
		ch.close();
	}

}
