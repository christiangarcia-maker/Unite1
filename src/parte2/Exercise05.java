package parte2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Creción del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaramos la variable donde se almacena los segundos.
		int segundos;
		
		// Declaramos la variable donde se almacena los minutos.
		int minutos;
		
		// Declaramos la variable donde se almacena las horas.
		int horas;
		
		// Pregunta al usuario por la cantidad de segundos.
		System.out.print("Introduce una cantidad de segundos: ");
		segundos = ch.nextInt();
		
		// Pasamos los segundos a minutos.
		minutos = segundos / 60;
		
		// Pasamos los minutos a horas.
		horas = minutos / 60;
		
		// Imprime en pantalla la cantidad de horas y minutos a la que corresponde esa cantidad de segundos.
		System.out.println("Número de horas: " + horas);
		System.out.println("Número de minutos: " + minutos);
		System.out.println("Número de segundos: " + segundos);
		
		// Cierre del escaner.
		ch.close();

	}

}
