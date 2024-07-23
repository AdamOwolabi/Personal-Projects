
/**
 * MathTest - An example class for assignment: CE - Math
 * @author Adam Owolabi
 * Copyright 2021 Howard Community College
 * @version 1.0
 */
import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Copyright 2021 Howard Community College\n");

		int integer1, integer2; // declare two integer variables
		double number1, number2; // declare two double variables

		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer 1: "); // prompt user for first integer value
		integer1 = input.nextInt(); // record response inside the variable.
		System.out.print("Enter integer 2: "); // prompt user for second integer value.
		integer2 = input.nextInt(); // record response inside the variable

		System.out.print("\nEnter double value 1: "); // prompt user for first double value.
		number1 = input.nextDouble(); // record response inside the variable
		System.out.print("Enter double value 2: "); // prompt user for second double value
		number2 = input.nextDouble(); // record response inside the variable

		int sum = integer1 + integer2; // add integers variable together
		double doubleSum = number1 + number2; // add double variable together
		int difference = integer1 - integer2; // Subtract integers variable from each other
		double doubleDiff = number1 - number2; // Subtract Double variable from each other
		int multiply = integer1 * integer2; // Multiply integers variable together
		double doubleMultiply = number1 * number2; // multiply double variable together
		int division = integer1 / integer2; // Divide integers variables from each other
		double doubleDivision = number1 / number2; // divide double variable from each other
		int mod = integer1 % integer2; // mod of integer values.

		if (integer2 > integer1) { // checks if second input is bigger than first
			difference = integer2 - integer1; // subtract biggest input variable.
		}
		if (number2 > number1) {
			doubleDiff = number2 - number1; // Subtract integers variable from each other
		}

		System.out.println("\nInteger Output: ");
		System.out.printf("Adding %d and %d =  %d%n", integer1, integer2, sum); // prints addition
		System.out.printf("Subtracting %d and %d =  %d%n", integer1, integer2, difference); // prints difference
		System.out.printf("Multiplying %d and %d =  %d%n", integer1, integer2, multiply); // print multiplication
		System.out.printf("Dividing %d and %d =  %d%n", integer1, integer2, division); // print division
		System.out.printf("Moding %d and %d = %d%n", integer1, integer2, mod); // print mod

		System.out.println("\n\nDouble Output: ");
		System.out.printf("Adding %.2f and %.2f = %.2f%n", number1, number2, doubleSum); // Print double sum
		System.out.printf("Subtracting %.2f and %.2f =  %.2f%n", number1, number2, doubleDiff); // print double
																								// difference
		System.out.printf("Multiplying %.2f and %.2f = %.2f%n", number1, number2, doubleMultiply); // print double
																									// multiply

		if (number2 == 0) { // checks if double2 is equal to 0
			System.out.println("You cannot divide by 0");
		} else {
			System.out.printf("Dividing %.2f and %.2f = %.2f%n", number1, number2, doubleDivision); // prints out double
																									// division
		}
	}

}
