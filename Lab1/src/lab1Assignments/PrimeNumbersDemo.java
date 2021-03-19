/**
* Name : Neelanjan Datta
* Description : Prime numbers program
* Date : 3/14/2021
*/
package lab1Assignments;

import java.util.Scanner;

public class PrimeNumbersDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which you want the prime numbers.");
		int num = sc.nextInt();
		prime(num);

	}

	private static void prime(int num) {
		int j = 2, i;
		while(j <= num)
		{
			int count = 0;
		
			for(i = 1 ; i <= j ; i++) {
					if(j%i == 0)
						count = count +1;
				}
			if(count == 2)
				System.out.print(" "+j);
			j++;
		}
	}

}
