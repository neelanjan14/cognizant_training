/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/
package stringAssignment;

import java.util.Scanner;

public class StringAssignment2 {
	public static void main(String[] args) {
		String url = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url : ");
		url = sc.nextLine();
		
		String command = getCommand(url);
		System.out.println(command);
	}

	private static String getCommand(String url) {
		String cmd = "";
		int j = url.length()-1 ;
		int i = url.length()-1;
			while(i >= 0 && url.charAt(i) != '/')i--;
			while(j >= 0 && url.charAt(j) != '.' )j--;
			cmd = cmd.concat(url.substring(i+1,j+1));
		return cmd;
	}

}
