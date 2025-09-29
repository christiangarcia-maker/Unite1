package unite1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Almacena la nota del primer timestre del usuario.
		int notaPrimerTimestre;
				
		// Almacena la nota del segundo timestre del usuario.
		int notaSegundoTimestre;
				
		// Almacena la nota del tercer timestre del usuario.
		int notaTercerTimestre;
		
		// Almacena la nota media que se muestra en el boletín de calificaciones.
		int boletinCalificaciones;
		
		// Almacena la nota media que se muestra en el expediente académico.
		double expedienteAcademico;
		
		// Pregunta al usuario la nota que tiene en el primer timestre.
		System.out.println("¿Cual es tu nota en el primer timestre?");
		notaPrimerTimestre = ch.nextInt();

		// Pregunta al usuario la nota que tiene en el segundo timestre.
		System.out.println("¿Cual es tu nota en el segundo timestre?");
		notaSegundoTimestre = ch.nextInt();
		
		// Pregunta al usuario la nota que tiene en el tercer timestre.
		System.out.println("¿Cual es tu nota en el tercer timestre?");
		notaTercerTimestre = ch.nextInt();
		
		// Almacena la media de las tres notas del usuario.
		boletinCalificaciones = (notaPrimerTimestre + notaSegundoTimestre + notaTercerTimestre)/3;
		
		// Almacena la media de las tres notas del usuario.
		expedienteAcademico = (notaPrimerTimestre + notaSegundoTimestre + notaTercerTimestre)/3.0;
		
		System.out.println("Tu nota se mostrará en el boletín como un: " + boletinCalificaciones);
		
		System.out.println("Tu nota se mostrará en el expediente académico como un: " + expedienteAcademico);
		
		ch.close();
	}

}
