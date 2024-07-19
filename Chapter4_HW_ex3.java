package ch3;

import java.util.Scanner;
import java.lang.Math;
public class Chapter4_HW_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Welcome Title
		System.out.println("Welcome to Expense Calculator!");

		//Rent Expense
		System.out.println("Enter amount of rent you will be paying in CAD: ");
		Scanner input = new Scanner (System.in);
		
		double rent = input.nextDouble();
		double expenseRent= rent;
		//total expense after rent
		System.out.println("Current Expenses are: $" + expenseRent );
		
		System.out.println("Enter amount of tutoring fee in CAD: ");
		Scanner input2 = new Scanner (System.in);
		double tutor = input.nextDouble();
		double expenseTutor= rent+tutor;
		//total expense after rent and tutot
		System.out.println("Current Expenses are: $" + expenseTutor);


		System.out.println("Enter amount of book fee in CAD: ");
		Scanner input3 = new Scanner (System.in);
		double book = input.nextDouble();
		double expenseBook= rent+tutor+book;
		//total expense after rent, tutour, and books
		System.out.println("Current Expenses are: $" + expenseBook);

	
		System.out.println("Enter Scholarship amount recieved in CAD: ");
		Scanner input4 = new Scanner (System.in);
		double scholarship = input.nextDouble();
		double expenseAll= rent+tutor+book;
		double expenseScholarship= rent+tutor+book - scholarship;
		//total expense without scholarship
		System.out.println("Your total expenses not including possible scholarship is: $" + expenseAll);
		//toal expense with scholarship
		System.out.println("Your total expenses after being covered by your scholarship: $" + Math.abs(expenseScholarship));
		
		System.out.println("Congratulations! your good at life and you only have $" + Math.abs(expenseScholarship));
		
		input.close();	
		
	}

}
