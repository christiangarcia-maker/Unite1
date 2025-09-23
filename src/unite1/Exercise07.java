package unite1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Almacena el nombre del usuario.
		String nombre;
		
		//Almacena la dirección del usuario.
		String direccion;
		
		// Almacena el telefono del usuario.
		String telefono;
		
		// Pregunta al usuario por su nombre.
		System.out.println("¿Cual es tu nombre?: ");
		nombre = ch.nextLine();
		
		// Pregunta al usuario por su dirección.
		System.out.println("¿Cual es tu dirección?: ");
		direccion = ch.nextLine();
		
		// Pregunta al usuario por su telefono.
		System.out.println("¿Cual es tú número de telefono?: ");
		telefono = ch.nextLine();
		
		// Imprime en pantalla el nombre, dirección y telefono del usuario.
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Telefono: " + telefono);

		// Cierre del escaner.
		ch.close();
	}

}
