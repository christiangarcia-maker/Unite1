package parte2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaramos la variable donde se almacenan los milímetros.
		int mm;
		
		// Declaramos la variable donde se almacenan los centímetros.
		int cm;
		
		// Declaramos la variable donde se almacenan los metros.
		int m;
		
		// Declaramos la variable donde se almacena el resultado total de la suma.
		double total;
		
		// Pregunta al usuario los mm, cm y metros.
		System.out.println("Introduce medida en milímetros: ");
		mm = ch.nextInt();
		System.out.println("Introduce medida en centímetros: ");
		cm = ch.nextInt();
		System.out.println("Introduce medida en metros: ");
		m = ch.nextInt();
		
		// Pasamos los milímetros a centímetros.
		mm /= 10;
		
		// Pasamos los metros a centímetros.
		m *= 100;
		
		// Inicializamos la variable total con la suma de las variables donde almacenamos los datos metrícos.
		total = m + cm + mm;
		
		// Imprime por pantalla el tota.
		System.out.println("Medida pasada a cm: " + total);
		
		// Cierre del escaner.
		ch.close();
		

	}

}
