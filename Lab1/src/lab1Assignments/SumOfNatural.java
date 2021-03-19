/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/

package lab1Assignments;

import java.util.Scanner;

public class SumOfNatural {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the natural numbers : ");
		int n = sc.nextInt();
		System.out.println("The sum of natural numbers divisible by 3 & 5 is : "+calculateSum(n));
	}

	private static int calculateSum(int n) {
		int sum = 0;
		for(int i = 1 ; i <= n ; i++) {
			if(i%3 == 0 && i%5 == 0){
				sum = sum + i;
			}
		}
		return sum;
		
	}

}
