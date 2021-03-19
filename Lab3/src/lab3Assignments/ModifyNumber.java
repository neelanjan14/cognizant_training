/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/

package lab3Assignments;

import java.util.Scanner;

public class ModifyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		System.out.println("The modified number is : "+modifyNumber(number));
	}

	private static int modifyNumber(int number1) {
		String numberString = String.valueOf(number1);
		StringBuffer sb = new StringBuffer();
		int difference = 0;
		for(int i = 0 ; i < numberString.length() ; i++) {
			if(i == numberString.length()-1) {
				sb.append(numberString.charAt(i));
			}
			else {
				difference = (int) numberString.charAt(i) - (int) numberString.charAt(i+1);
				difference = Math.abs(difference);
				sb.append(difference);
			}
		}
		return Integer.parseInt(sb.toString());
	}
	

}
