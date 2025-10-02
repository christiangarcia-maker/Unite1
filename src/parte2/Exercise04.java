package parte2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaramos las siguientes varibles que hacen falta para imprimir el polinomio de segundo grado.
		int a;
		int b;
		int c;
		int x;
		
		// Pregunta al usuario sobre los diferentes valores que hacen falta para el polinomio de segundo grado.
		System.out.print("Introduce valor para a: ");
		a = ch.nextInt();
				
		System.out.print("Introduce valor para b: ");
		b = ch.nextInt();
				
		System.out.print("Introduce valor para c: ");
		c = ch.nextInt();
				
		System.out.print("Introduce valor para x: ");
		x = ch.nextInt();
				
		// Imprime el polinomio de segundo grado.
		System.out.println("Polinomio de segundo grado: y= " + a + ("*") + x + ("^2+") + b + ("*") + x + ("+") + c);
		
		// Cierre del escaner.
		ch.close();

	}

}
