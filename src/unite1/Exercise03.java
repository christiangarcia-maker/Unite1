package unite1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Creamos nuestro escaner.
		Scanner ch = new Scanner(System.in);
		
		// Creamos una variable para el año actual.
		int añoActual;
		
		// Creamos una variable para el año de nacimiento.
		int añoNacimiento;
		
		int edad;
		
		// Preguntamos al usuario el año actual.
		System.out.println("Introduce el año actual: ");
		
		// Lee el año actual.
		añoActual = ch.nextInt();
		
		// Preguntamos al usuario el año de nacimiento.
		System.out.println("Introduce tu año de nacimiento: ");
		
		// Lee el año de nacimiento.
		añoNacimiento = ch.nextInt();
		
		// Colocamos a edad el valor del resto de las dos variables del año.
		edad = añoActual - añoNacimiento;
		
		// Imprimimos la edad que tiene el usuario.
		System.out.println("Esta es tu edad: " + edad);
		
		// Cerramos el escaner.
		ch.close();
	}

}
