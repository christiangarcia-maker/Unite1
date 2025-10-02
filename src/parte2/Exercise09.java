package parte2;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaramos la variable que almacena el número del problema.
		int numeroProblema;
		
		// Declaramos la variable donde se almacena el número del volumen al que le pertenece del problema.
		int volumen;
		
		System.out.print("Ingrese número: ");
		numeroProblema = ch.nextInt();
		
		// Dividimos el número en dos para almacenar unicamente el número del volumen.
		volumen = numeroProblema/ 100;
		
		// Imprime el volumen al que le pertenece.
		System.out.print("Este problema pertenece al volúmen " + volumen);
		
		// Cierre del escaner.
		ch.close();

	}

}
