/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/
package arraysAssignments;

import java.util.Scanner;

public class GradesStatistics {

	public static void main(String[] args) {
		int numStudents = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		numStudents = sc.nextInt();
		
		int[] grades = new int[numStudents];
		
		for(int i = 0 ; i < numStudents ; i++) {
			System.out.println("Enter the grades of the student "+(i+1)+": ");
			grades[i] = sc.nextInt();
		}
		double average = 0.00;
		int max = grades[0] , min = grades[0];
		//Average
		for(int i = 0 ; i < numStudents ; i++) {
			average = average +grades[i];
		}
		average = average/numStudents;
		//System.out.println(average);
		//Minimum
		for(int i = 1 ; i < numStudents ; i++) {
			if(min > grades[i]) {
				min = grades[i];
			}			
		}//System.out.println(min);
		//Maximum
		for(int i = 0; i < numStudents ; i++) {
			if(max < grades[i]) {
				max = grades[i];
			}
		}//System.out.println(max);
		
		System.out.printf("The average is %.2f : ",average);
		System.out.println();
		System.out.println("The minimum is : "+min);
		System.out.println("The maximum is : "+max);
	}

}
