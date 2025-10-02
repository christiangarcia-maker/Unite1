package parte2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaramos e inicializamos la constante donde se guarda el precio para las entradas infantiles.
		final double PRECIO_INFANTIL = 15.50;
		
		// Declaramos e inicializamos la constante donde se guarda el precio para las entradas de adultos.
		final double PRECIO_ADULTO = 20;
		
		// Declaramos la variable donde se almacena el número de entradas infantiles.
		int entradasInfantil;
		
		// Declaramos la variable donde se almacena el número de entradas de adultos.
		int entradasAdulto;
		
		// Declaramos la variable donde se almacena el precio total.
		double total;
		
		// Pregunta al usuario por el número de entradas infantiles.
		System.out.print("Introduzca número de entradas infantiles: ");
		entradasInfantil = ch.nextInt();
		
		// Pregunta al usuario por el número de entradas de adultos.
		System.out.print("Introduzca número de entradas para adultos: ");
		entradasAdulto = ch.nextInt();
		
		// Multiplicamos el número de entradas infantiles por su precio.
		entradasInfantil *= PRECIO_INFANTIL;
		
		// Multiplicamos el número de entradas de adultos por su precio.
		entradasAdulto *= PRECIO_ADULTO;
		
		// Inicializamos la variable total con el precio de ambos tipos de entradas.
		total = entradasInfantil + entradasAdulto;
		
		// Realizamos un ternario para que si el total sea mayor de 100 se aplique un descuento del 5%.
		total = total > 100 ? total - total * 5 / 100 : total;
		
		// Imprime en dinero total ganado.
		System.out.print("Precio a pagar: " + total + "€");
		
		// Cierre del escaner.
		ch.close();

	}

}
