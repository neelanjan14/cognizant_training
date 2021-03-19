/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/
package lab1Assignments;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		boolean check = checkNumber(number);
		if(check == true)
			System.out.println("The number is increasing.");
		else
			System.out.println("The number is not increasing");

	}

	private static boolean checkNumber(int number) {
		
		String check = String.valueOf(number); 
	    int length = check.length(); 
	    for (int i = 0; i < length-1; i++) {
	        if(check.charAt(i) <= check.charAt(i+1)) { 
	            continue; 
	        }
	        else return false; 
	    }
	    return true; 
	}

}
