/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/16/2021
*/
package lab2Assignments;

import java.util.Scanner;

public class LongestElementSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length;
		System.out.println("Enter the length of the array : "); 
		length = sc.nextInt();
		int[] items = new int[length];
		System.out.println("Enter the elements : ");
		for(int i = 0 ; i < length ; i++)
			items[i] = sc.nextInt();
		
		
		sort(items);
		int sequenceLength = subSequence(items);
		System.out.println(sequenceLength);
	}

	private static void sort(int[] items) {
		int temp = 0;
		for(int i = 0 ; i < items.length ; i++) {
			for(int j = i+1 ; j < items.length ; j++ ) {
				if(items[i] > items[j]) {
					temp = items[i];
					items[i] = items[j];
					items[j] = temp;
				}
			}
		}
		
	}

	private static int subSequence(int[] items) {
		int length = 0;
		int current = 1;
		for(int i = 1 ; i < items.length ; i++) {
			if(items[i] != items[i-1])
				if(items[i] - items[i-1] ==1) current +=1;
			else {
				length = Math.max(length, current);
				current = 1;
			}
		}
		return length;
	}
	
	

}
