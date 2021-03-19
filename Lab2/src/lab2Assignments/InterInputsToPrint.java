/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/16/2021
*/

package lab2Assignments;

import java.util.Scanner;

public class InterInputsToPrint {
	public static void main(String[] args) {
		int[] array = new int[20];
		int j = 0;
		int length = 20;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 20 integer inputs : ");
		for(int i = 0 ; i < length ; i++)
			array[i] = sc.nextInt();
		
		int [] check = new int[5];
		//no. of positive integers
		for(int i = 0 ; i < length ; i++) {
			if(array[i] > 0)
				j++;
		}check[0] = j;
		j = 0;
		
		//no. of negative integers
		for(int i = 0 ; i < length ; i++) {
			if(array[i] < 0)
				j++;
		}check[1] = j;
		j = 0;
		
		//no of odd integers
		for(int i = 0 ; i < length ; i++) {
			if(array[i] % 2 != 0)
				j++;
		}check[2] = j;
		j = 0;
		
		//no. of even integers
		for(int i = 0 ; i < length ; i++) {
			if(array[i] % 2 == 0) {
				if(array[i] == 0)
					j=j-1;;
				j++;
			}
		}check[3] = j;
		j = 0;
		
		//no. of zeros
		for(int i = 0 ; i < length ; i++) {
			if(array[i] == 0)
				j++;
		}check[4] = j;
		
		System.out.println("1. number of positive numbers : "+check[0]+
				 "\n 2. number of negative numbers : "+check[1]
				+ "\n 3. number of odd numbers : "+check[2]
				+ "\n 4. number of even numbers : "+check[3]
				+ "\n 5. number of 0s. : "+check[4]);
	}
	
}
