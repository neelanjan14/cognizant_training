/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/
package lab2Assignments;

import java.util.Scanner;

public class AlphabeticalOrderSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings you want to enter : ");
		int length = sc.nextInt();
		
		String[] arr = new String[length];
		System.out.println("Enter the strings : ");
		for(int i = 0 ; i < length ; i++) {
			arr[i] = sc.next();
		}
		
		System.out.println(sortStrings(arr));
	}

	private static String sortStrings(String[] arr) {
		String temp = "";
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[i].compareTo(arr[j])>0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < arr.length ; i++) {
			sb.append(arr[i]+ " ");
		}
		temp = sb.toString();
		return temp;
	}

}
