package english;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		//Set the variable for pounds.
		double lb;
		
		//Set the variable for kl.
		double kg;
		
		//Set the constant for the value.
		final double lbn = 2.2;

		//Prompt for value in pounds.
		System.out.print("Introduce pounds: ");
		
		//Enter value in pounds.
		lb = ch.nextDouble();
		
		//Set value to old value.
		kg = lb / lbn;
		
		//Display value in kilos.
		System.out.print("Lb to kg: " + kg);
		
		//Close the scanner.
		ch.close();

	}

}
