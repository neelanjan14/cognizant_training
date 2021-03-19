/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/
package lab1Assignments;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the natural numbers : ");
		int n = sc.nextInt();
		System.out.println(calculateDifference(n));

	}

	private static int calculateDifference(int n) {
		int sumOfSquares = 0;
		int squareOfSum = 0;
		for(int i = 1 ; i <= n ; i++) {
			sumOfSquares = sumOfSquares + i*i;
			squareOfSum = squareOfSum + i;
		}
		squareOfSum = squareOfSum*squareOfSum;
		int difference = sumOfSquares - squareOfSum;
		return difference;
	}

}
