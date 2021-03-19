/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/16/2021
*/
package stringAssignment;

import java.util.Scanner;

public class StringAssignment1 {
	public static void main(String[] args) {
		String str = "";//"Hello My Dear Friends";
		
		/*Challenge :  Write your logic here so that the output should be in reverse order. It should be displayed as
		 * Friends Dear My Hello.
		 * You need to reverse the String word by word. 
		 * Limitation :  Do not use the reverse method
		 */
		String reverse = "";
		System.out.println("Enter the sentence to reverse : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int length = 0;
		int i = str.length()-1;
		while(i >=0) {
			while(i >= 0 && str.charAt(i) == ' ') i--;
			
			int j = i;
			if(i<0)break;
			while(i>=0 && str.charAt(i) != ' ') i--;
			
			if(reverse.isEmpty()) {
				reverse = reverse.concat(str.substring(i+1,j+1));
			}
			else {
				reverse = reverse.concat(" " + str.substring(i+1,j+1));}
			
		}
		System.out.println("The reverse string is : " + reverse);
		
	}

}
