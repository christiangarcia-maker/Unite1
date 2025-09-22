package unite1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Creación las siguientes variables, donde se van a guardar el valor del radio, longitud y area.
		double radio;
		double longitud;
		double area;
		
		// Pregunta al usuario sobre el radio.
		System.out.println("Introduce el radio de la circunferencia: ");
		
		// Lee el numero del radio.
		radio = ch.nextDouble();
		
		// Añade a la variable longitud el siguiente valor.
		longitud = 2 * Math.PI * radio;
		
		// Añade a la variable area el siguiente valor.
		area = Math.PI * Math.pow(radio, 2);
		
		// Imprime en pantalla la longitud de la circunferencia.
		 System.out.println("La longitud de la circunferencia es: " + longitud);
		 
		// Imprime en pantalla el area de la circunferencia.
	    System.out.println("El área de la circunferencia es: " + area);
	     
	    // Cierre del scanner.
	    ch.close();
	        
	}

}
