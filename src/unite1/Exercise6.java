package unite1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Se almacena el primer numero del usuario.
		double numero1;
		
		// Se almacena el segundo numero del usuario.
		double numero2;
		
		// Se almacena la suma de los dos numeros.
		double suma;
		
		// Se almacena la resta de los dos numeros.
		double resta;
		
		// Se almacena la multiplicación de los dos numeros.
		double multiplicacion;
		
		// Se almacena la división de los dos numeros.
		double division;
		
		// Pregunta por el primer numero.
		System.out.println("Coloque el primer numero: ");
		numero1 = ch.nextDouble();
		
		// Pregunta por el segundo numero.
		System.out.println("Coloque el segundo numero: ");
		numero2 = ch.nextDouble();
		
		// Suma el valor de los dos numeros almacenados.
		suma = numero1 + numero2;
		
		// Resta el valor de los dos numeros almacenados.
		resta = numero1 - numero2;
		
		// Multiplica el valor de los dos numeros almacenados.
		multiplicacion = numero1 * numero2;
		
		// Divide el valor de los dos numeros almacenados.
		division = numero1/numero2;
		
		// Imprime la suma, resta, multiplicación y división de los dos numeros almacenados.
		System.out.println("Esta es la suma de ambos numeros: " + suma);
		System.out.println("Esta es la resta de ambos numeros: " + resta);
		System.out.println("Esta es la multiplicación de ambos numeros: " + multiplicacion);
		System.out.println("Esta es la división de ambos numeros: " + division);
		
		// Cierre del escaner.
		ch.close();
	}

}
