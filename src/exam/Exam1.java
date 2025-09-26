package exam;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Almacena la nota del primer timestre que dé el usuario.
		int notaPrimerTimestre;
		
		// Almacena la nota del segundo timestre que dé el usuario.
		int notaSegundoTimestre;
		
		// Almacena la nota del tercer timestre que dé el usuario.
		int notaTercerTimestre;
		
		// Almacena la nota media del usuario.
		double notaMedia;
		
		// Pregunta al usuario por la nota del primer timestre.
		System.out.println("¿Que nota tienes en el primer timestre?");
		notaPrimerTimestre = ch.nextInt();
		
		// Pregunta al usuario por la nota del segundo timestre.
		System.out.println("¿Que nota tienes en el segundo timestre?");
		notaSegundoTimestre = ch.nextInt();
		
		// Pregunta al usuario por la nota del tercer timestre.
		System.out.println("¿Que nota tienes en el tercer timestre");
		notaTercerTimestre = ch.nextInt();
		
		// Inicializamos notaMedia con las tres notas que nos ha dado el usuario.
		notaMedia = (notaPrimerTimestre + notaSegundoTimestre + notaTercerTimestre)/3;
		
		// Imprime la nota media del usuario.
		System.out.println("Esta es tu nota media: " + notaMedia);
		
		// Cierre del escaner.
		ch.close();
	}

}
