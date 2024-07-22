/* 
 * LoopsAssignment
 * Copyright 2021 Howard Community College
 * @author Adam Owolabi
 * @version 1.0
 * */
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Copyright 2021 Howard Community College\n");
		
		Scanner input = new Scanner(System.in);
		int counter = 1; //Declare and instantiate variables. 
		int count = 1;
		for (int i = 0; i < 20; i++) { //for loop to print odd numbers between 0-20
			if(i % 2 == 1) {
				System.out.printf("%d  ", i);
			}
		}
		System.out.print("\n");
		while(counter < 20) { //while loop that prints odd numbers between 0-20
			if(counter % 2 == 1) { //checks if number is odd
			System.out.printf("%d  ", counter);
			}
			counter++; //Increments counter.
		}
		System.out.println();
		counter = 1;
		do {  //Do while loop that prints odd numbers between 0-20
		if(counter % 2 == 1) { //
			System.out.printf("%d  ", counter);
		} counter++; //increment operator.
		} while(counter < 20);  
		
		System.out.println();
		
		char letter = ' ';//instantiate string character.
		
		while(letter != 'q' ) { // while loop that checks if user enters a letter other than q. And uses sentinel value to end loop.
			System.out.print("Enter a Letter: ");
			letter = (input.next().charAt(0)); //Reads user's input. 
			System.out.printf("You entered: %s%n", letter); //while loop that checks if user enters letters other than q using sentinel value.
		} 	
		System.out.printf("goodbye!");
		
		do { //do while loop using sentinel value. Do while loop that checks if user enters a letter other than q.
			System.out.print("\nEnter a Letter: "); //ask user for a letter.
			letter = (input.next().charAt(0)); //Reads user's input. 
			System.out.printf("You entered: %s%n", letter); //prints output
		} while(letter != 'q'); //Do while loop that checks if user enters letters other than q using sentinel value.
		System.out.printf("goodbye!");
	}
}
