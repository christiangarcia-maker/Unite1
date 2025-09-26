package unite1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Almacena el año actual.
		int añoActual;
		
		// Almacena el año de nacimiento.
		int añoNacimiento;
		
		// Almacena la edad del usuario.
		int edad;
		
		// Pregunta al usuario el año actual.
		System.out.println("Introduce el año actual: ");
		
		// Lee el año actual.
		añoActual = ch.nextInt();
		
		// Pregunta al usuario el año de nacimiento.
		System.out.println("Introduce tu año de nacimiento: ");
		
		// Lee el año de nacimiento.
		añoNacimiento = ch.nextInt();
		
		// Coloca a edad el valor del resto de las dos variables del año.
		edad = añoActual - añoNacimiento;
		
		// Imprime la edad que tiene el usuario.
		System.out.println("Esta es tu edad: " + edad);
		
		// Cierre el escaner.
		ch.close();
	}

}
