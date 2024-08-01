/**
 * MatrixMult - An example class for assignment: lab 5- Matrix Multiplication
 * Copyright 2021 Howard Community College
 * 
 * @author Adam Owolabi
 * @version 1.0
 */

public class MatricMult {
	public static int result[][] = new int[2][2];
	public static int m[][] = {{ 5, 6, 2 }, { 1, 7, 3 }};
	public static int n[][] = { { 2, 2 }, { 7, 9 }, { 1, 2 } };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Copyright 2021 Howard Community College");

		simpleMatrixMult(result);
		for(int y[] : result) {
			for(int j : y){
				System.out.print(j + " ");
			}
			System.out.println();
		}		
		 
	}
	
	public static int[][] simpleMatrixMult(int[][]array) {
		int sum = 0;
		for( int i = 0; i<2;i++) {
			for (int j = 0; j < 2; j++) {
				for( int k = 0; k<3; k++) {
					sum += m[i][k]*n[k][j];
				}
				result[i][j] = sum;
				sum = 0;
			}
				
		}
		return result;
	}
}


	