/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/
package arraysAssignments;

import java.util.Scanner;

public class ArrayInStars {
	public static void main(String[] args) {
		final int NUM_ITEMS;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		NUM_ITEMS = sc.nextInt();
		
		int[] items = new int[NUM_ITEMS];
		System.out.println("Enter the data into the array : ");
		for(int  i = 0 ; i < NUM_ITEMS ; i++) {
			items[i] = sc.nextInt();
			}
		
		for(int i = 0 ;  i < NUM_ITEMS ; i++) {
			System.out.print(i+": ");
			for(int j = 0 ; j < items[i] ; j++) {
				System.out.print("*");
			}
			System.out.print("("+items[i]+")");
			System.out.println();
		}
	}

}
