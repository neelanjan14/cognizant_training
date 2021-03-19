/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/
package lab3Assignments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerSum {

	public static void main(String[] args) {
		int n ; 
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integers : ");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			n = Integer.parseInt(temp);
			System.out.println(n);
			sum = sum + n;
		}
		System.out.println("The sum of the integers : "+sum);
	}

}
