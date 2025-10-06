package english;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		//Set the variable for the students.
		int students;
				
		//Set the variable for the groups.
		int groups;
				
		//Set the variable for the total groups.
		int totalStu;
				
		//Set the variable for the total students.
		int totalGro;

		//Ask the question, how many students are in the class.
		System.out.print("How many students?: ");
				
		//The scanner reads the answer.
		students = ch.nextInt();
				
		System.out.print("How many groups?: ");
				
		//The scanner reads the answer.
		groups = ch.nextInt();
				
		//Calculate how many groups are going to be formed.
		totalGro = students / groups;
				
		//Calculate how many students are left without a team.
		totalStu = students % groups;
				
		//Show the answers.
		System.out.println("Number of groups: " + totalGro);
		System.out.print("Number of students left out of the group: " + totalStu);
		
		//Close the scanner.
		ch.close();
	}

}
