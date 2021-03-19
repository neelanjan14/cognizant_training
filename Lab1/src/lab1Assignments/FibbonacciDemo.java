/**
* Name : Neelanjan Datta
* Description : Fibbonacci series program 
* Date : 3/13/2021
*/
package lab1Assignments;

import java.util.Scanner;

public class FibbonacciDemo {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fib;
		System.out.println("Enter the length of the series");
		int length = sc.nextInt();
		fib = series(length);
		System.out.println("Series : " + fib);
	}

	private static String series(int length) {
		int i = 1;
		int nt = 0, t1 = 0, t2 = 1;
		String fib = "";
		StringBuilder sb = new StringBuilder(fib);
		while(i<=length){
			sb.append(t1+" ");
			nt = t1 + t2;
			t1 = t2;
			t2 = nt;
			i++;
			}
		String series = "";
		fib = sb.toString();
		return fib;
		
	}

}
