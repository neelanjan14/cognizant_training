/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/
package lab3Assignments;

import java.util.Scanner;

public class PositiveString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String positive = "";
		System.out.println("Enter the string : ");
		positive = sc.nextLine();
		boolean bool =  check(positive);
		if(bool == true) {
			System.out.println("Positive string");
		}
		else if(bool == false ) {
			System.out.println("Not positive string");
		}
	}

	private static boolean check(String positive) {
		int j = 1;
		for(int i = 0 ; i < positive.length()-1 ; i++) {
			if(positive.charAt(i)<positive.charAt(i+1)) {
				j++;
			}
		}
		if(j == positive.length())
			{
				return true;
				
			}
		else 
			return false;
		
	}

}
