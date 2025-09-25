package unite1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Almacena los beneficios anuales.
		double anuales;
		
		// Almacena la cantidad de dinero de las peras.
		final double DINERO_PERAS = 1,95 * kgPeras;
		
		// Almacena la cantidad de dinero de las manzanas.
		final double DINERO_MANZANAS = 2,35 * kgManzanas;
		
		// Almacena la cantidad de kg de peras solicitadas.
		double kgPeras;
		
		// Almacena la cantidad de kg de manzanas solicitadas.
		double kgManzanas;
		
		System.out.println("¿Cuantos KG de pera quieres?: ");
		kgPeras = ch.nextDouble();
		
		System.out.println("¿Cuantos KG de manzana quieres?: ");
		kgManzanas = ch.nextDouble();
		
		anuales = DINERO_PERAS + DINERO_MANZANAS;
		
		System.out.println("");
		
	}

}
