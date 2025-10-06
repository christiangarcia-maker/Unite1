package english;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		//Set the variable for the lenght.
		int length;
		
		//Set the variable for the height.
		int height;
		
		//Set the variable for the area.
		int area;
		
		//Display the question for the lenght.
		System.out.print("Introduce the value for the length: ");
		
		//The scanner reads the answer.
		length = ch.nextInt();
		
		//Display the question for the height.
		System.out.print("Introduce the value for the height: ");
		
		//The scanner reads the answer.
		height = ch.nextInt();
		
		//Calculate the area.
		area = length * height;
		
		//Show the answer.
		System.out.print("Area of the rectangle: " + area);
		
		//Close the scanner.
		ch.close();

	}

}
