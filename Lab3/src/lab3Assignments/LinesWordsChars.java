/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/
package lab3Assignments;

import java.util.Scanner;

public class LinesWordsChars {
	static final int OUT = 0;
	static final int IN = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = "";
		System.out.println("Enter the text");
		text = sc.nextLine();
		int i , j=0;
		for(i = 0 ,j = 0 ; i <text.length() ; i++) {
			if(text.charAt(i) != ' ' && text.charAt(i) != '.' && text.charAt(i) != '!' && text.charAt(i) != '?' && text.charAt(i) != ',') {
				j = j+1;
			}
		}
		System.out.println("Number of Characters "+j);
		char ch = 0 ;
		for(i = 0 ; i < text.length() ; i++)
		{
			ch = text.charAt(i);
		}
		j=0;
		for(i = 0 ,j = 0 ; i <text.length() ; i++) {
			if(text.charAt(i) == '.' || text.charAt(i) == ch || text.charAt(i) == '!' || text.charAt(i) == '?') {
				j = j+1;
			}
			
		}
		System.out.println("Number of Lines "+j);
		
		int state = OUT;
		j = 0;
		i = 0;
		while(i <text.length()) {
			if(text.charAt(i) == '.' || text.charAt(i) == ' ' || text.charAt(i) == '!' || text.charAt(i) == '?' || text.charAt(i) == ',') {
				state = OUT;
			}
			else if(state == OUT) {
				state = IN;
				++j;
			}
			++i;
		}
		System.out.println("Number of Words "+j);
	}

}
