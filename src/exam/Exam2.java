package exam;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Almacena las horas que ha hechado el usuario en esta semana.
		int horasSemanales;
			
		// Almacena el dinero que gana por hora.
		double dineroPorHora;
		
		// Almacena el porcentaje de impuestos que se le resta al salario.
		int descuentoImpuestos;
		
		// Almacena el salario semanal de usuario.
		int salarioSemanal;
		
		// Almacena el salario semanal con los impuestos ya descontados.
		double salarioSemanalDescontado;
		
		// Pregunta al usuario cuantas horas ha trabajado.
		System.out.println("¿Cuantas horas has trabajado esta semana?");
		horasSemanales = ch.nextInt();
		
		// Pregunta al usuario cuanto cobra por hora.
		System.out.println("¿Cuanto cobras por hora?");
		dineroPorHora = ch.nextInt();
		
		// Inicializa salarioSemanal con los datos del usuario.
		salarioSemanal = horasSemanales * dineroPorHora;
		
		// Si cobram más de 1000 almacenará 15, si no, 10.
		descuentoImpuestos = salarioSemanal>1000 ? 15 : 10;
		
		// Calcula el salario semanal con el descuento de los impuestos y lo almacena.
		salarioSemanalDescontado = salarioSemanal - salarioSemanal * descuentoImpuestos/100.0;
		
		// Imprime el salario con los impuestos pagados.
		System.out.println("Este es tu salario semanal con impuestos: " + salarioSemanalDescontado + "€");
		
		// Cierre del escaner.
		ch.close();

	}

}
