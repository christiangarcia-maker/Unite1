package english;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
	
		//Set up the variable for the age.
		int age;
				
		//Set up the variable for the year.
		int year;
				
		//Display the question.
		System.out.print("How old are you?: ");
				
		//The scanner reads the answer.
		age = ch.nextInt();
				
		//Calculate the variable.
		year = 2025 - age;
				
		//Show the answer.
		System.out.print("You were born in " + year);
		
		//Close the scanner.
		ch.close();
	}

}
