package unite1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Almacena los beneficios anuales.
		double anuales;
		
		// Almacena la cantidad de dinero de las peras.
		double DINERO_PERAS;
		
		// Almacena la cantidad de dinero de las manzanas.
		double DINERO_MANZANAS;
		
		// Almacena la cantidad de kg de peras solicitadas.
		double kgPeras;
		
		// Almacena la cantidad de kg de manzanas solicitadas.
		double kgManzanas;
		
		// Pregunta al usuario los KG de pera que quiere.
		System.out.println("¿Cuantos KG de pera quieres?: ");
		kgPeras = ch.nextDouble();
		
		// Pregunta al usuario los KG de manzana que quiere.
		System.out.println("¿Cuantos KG de manzana quieres?: ");
		kgManzanas = ch.nextDouble();
		
		// Almacena el precio de peras por KG.
		DINERO_PERAS = 1.95 * kgPeras;
		
		// Almacena el precio de manzanas por KG.
		DINERO_MANZANAS = 2.35 * kgManzanas;
		
		// Almacena el precio anual que se consigue.
		anuales = DINERO_PERAS + DINERO_MANZANAS;
		
		// Imprime el importe total de las manzanas.
		System.out.println("Importe total peras: " + DINERO_MANZANAS + "€");
		
		// Imprime el importe total de las peras.
		System.out.println("Importe total manzanas: " + DINERO_PERAS +"€" );
		
		// Imprime el importe total anual.
		System.out.println("Importe anual : " + anuales + "€");
		
		// Cierre del escaner.
		ch.close();
		
	}

}
