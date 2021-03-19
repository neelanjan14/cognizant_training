/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/

package lab1Assignments;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		if(checkNumber(n))
			System.out.println("Is a power of 2");
		else
			System.out.println("Is not a power of 2");

	}

	private static boolean checkNumber(int n) {
		return (n != 0) && (n & (n-1)) == 0;
		
	}

}
