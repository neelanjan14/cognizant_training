/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/16/2021
*/
package lab2Assignments;

import java.util.*;

public class SecondSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		
		int[] array = new int[length];
		System.out.println("Enter the elements in the array : ");
		for(int i = 0 ; i < length ; i++)
			array[i] = sc.nextInt();
		int secondSmallest = 0;
		secondSmallest = getSecondSmallest(array,length);
		System.out.println("The second smallest element is : "+secondSmallest);
	}

	private static int getSecondSmallest(int[] array , int length) {
		int temp = 0;
		for(int i = 0 ; i < length ; i++) {
			for(int j = i+1 ; j < length ; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[1];
		
	}

}
