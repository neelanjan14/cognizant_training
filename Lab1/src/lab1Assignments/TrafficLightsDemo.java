/**
* Name : Neelanjan Datta
* Description : Traffic lights program 
* Date : 3/13/2021
*/
package lab1Assignments;

import java.util.Scanner;

public class TrafficLightsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select one of the three lights ");
		System.out.println("1.Red");
		System.out.println("2.Yellow");
		System.out.println("3.Green");
		int opt = sc.nextInt();
		choice(opt);
	}
	private static void choice(int opt) {
			switch(opt) {
			case 1 : System.out.println("Stop");
					 break;
			case 2 : System.out.println("Ready");
			         break;
			case 3 : System.out.println("Go");
					 break;
			default : System.out.println("Wrong Input");
			}
	}

}
