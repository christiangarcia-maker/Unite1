package unite1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Almacena true o false si está lloviendo o no.
		boolean estaLloviendo;
		
		// Almacena true o false si has terminado o no las tareas.
		boolean tareasFinalizadas;
		
		// Almacena true o false si tienes que ir o no a la biblioteca.
		boolean irBiblioteca;
		
		// Almacena true o false si puedes salir o no.
		boolean salir;
		
		// Pregunta al usuario si está lloviendo.
		System.out.println("¿Está lloviendo? ");
		estaLloviendo = ch.nextBoolean();
		
		// Pregunta al usuario si has terminado las tareas.
		System.out.println("¿Has terminado las tareas? ");
		tareasFinalizadas = ch.nextBoolean();
		
		// Pregunta al usuario si tienes que ir o no a la biblioteca.
		System.out.println("¿Tienes que ir a la biblioteca?");
		irBiblioteca = ch.nextBoolean();
		
		// Dependiendo de lo que haya almacenado anteriormente, guardará true o false.
		salir = (estaLloviendo | tareasFinalizadas);
		
		// Imprime true o false dependiendo de si puedes o no salir.
		System.out.println("¿Puedes salir: " + salir);
		ch.close();
	}

}
