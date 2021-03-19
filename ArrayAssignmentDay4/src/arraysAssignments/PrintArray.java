/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/
package arraysAssignments;

import java.util.Scanner;

public class PrintArray {
	public static void main(String[] args) {
		final int NUM_ITEMS ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array to print : ");
		NUM_ITEMS = sc.nextInt();
		
		int[] items = new int[NUM_ITEMS];
		System.out.println("Enter the data into the array : ");
		for(int i = 0 ; i < NUM_ITEMS ; i++) {
			items[i] = sc.nextInt();
		}
		
		System.out.println("The data in the array is : ");
		for(int i = 0 ; i < NUM_ITEMS ; i++) {
			System.out.print(items[i] + " ");
		}
		
	}

}
