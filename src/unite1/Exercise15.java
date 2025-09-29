package unite1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		// Creacción del escaner
		Scanner ch = new Scanner(System.in);
		
		// Creación del constante donde se guarda el IVA.
		final int IVA = 21;
		
		// Almacena el precio que da el usuario.
		double precio;
		
		// Almacena el precio con iva.
		double precioConIVA;
		
		// Pregunta al usuario por el precio.
		System.out.println("Introduce un precio: ");
		precio = ch.nextDouble();
		
		// Inicializamos precioConIVa con el siguiente calculo, almacenando el precio con iva.
		precioConIVA = precio + IVA * precio/100;
		
		// Imprime el precio con iva.
		System.out.println("El precio con IVA es de: " + precioConIVA);
		
		// Cierre del escaner.
		ch.close();
	}

}
