/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/13/2021
*/
package lab1Assignments;
import java.util.*;

public class CubesDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt(); 
		System.out.println("The sum of the cubes of the digits of " + num + " is : " + cubeNum(num));
	}

	private static int cubeNum(int num) {
		int digit = 0, cubeSum = 0;
		
		while(num != 0) {
			digit = num%10;
			cubeSum = cubeSum + (digit*digit*digit);
			num = num/10;
		}
		return cubeSum;
		
		
	}

}
