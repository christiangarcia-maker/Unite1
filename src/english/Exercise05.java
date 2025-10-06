package english;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		//Set the variable for the weight.
		double weight;
				
		//Set the variable for the height.
		double height;
				
		//Set the variable for the BMI.
		double bmi;
				
		//Ask the weight of the user.
		System.out.print("Enter your weight: ");
				
		//The scanner reads the answer.
		weight = ch.nextDouble();
				
		//Ask the height of the user.
		System.out.print("Enter your height: ");
				
		//The scanner reads the answer.
		height = ch.nextDouble();
				
		//Calculate the BMI.
		bmi = weight / (height * height);
				
		//Show the asnwer.
		System.out.print("Your BMI is: " + bmi);
		
		//Close the scanner.
		ch.close();

	}

}
