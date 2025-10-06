package english;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		//Set the variable for the price.
		double price;
		
		//Set the variable for the tax.
		int tax;
		
		//Display program title.
		System.out.print("English Program: TAX CALCULATOR");
		
		//Display prompt for price.
		System.out.print("Introduce the price: ");
		
		//Enter price.
		price = ch.nextDouble();
		
		//Display prompt for tax.
		System.out.print("Introduce the tax: ");
		
		//Enter tax.
		tax = ch.nextInt();
		
		//Set price TO price.
		price = price + price*tax/100;
		
		//Display new price.
		System.out.print("The new price, with tax is: " + price);
		
		//Close the scanner.
		ch.close();
	}

}
