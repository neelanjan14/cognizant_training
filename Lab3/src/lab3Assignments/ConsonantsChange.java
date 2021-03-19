/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/

package lab3Assignments;

import java.util.Scanner;

public class ConsonantsChange {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		System.out.println("Enter the word in capital letters : ");
		name = sc.nextLine();
		System.out.println(alterString(name));

	}

	private static String alterString(String name) {
		char[] edit = new char[name.length()];
		for(int i=0 ; i<name.length(); i++)
			{
				edit[i] = name.charAt(i);
			}
		
		for(int i = 0 ; i < name.length() ; i++) {
			if(edit[i] != 'A' && edit[i] != 'E' && edit[i] != 'I' && edit[i] != 'O' && edit[i] != 'U') {
				if(edit[i] == 'Z')
					{edit[i] = 'A';
					}
			
				else {
					edit[i] = (char)(edit[i]+1);
				}
			}	
		}
		return String.valueOf(edit);
	}
	

}
