/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/17/2021
*/
package lab3Assignments;

import java.util.Scanner;

public class MirrorString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mirror = "";
		System.out.println("Enter the word to get image : ");
		mirror = sc.nextLine();
		System.out.println(getImage(mirror));
	}

	private static String getImage(String mirror) {
		String image = "";
		StringBuffer sb = new StringBuffer(mirror);
		sb.reverse();
		image = mirror+"|"+sb;
		return image;
		
	}

}
