/**
* Name : Neelanjan Datta
* Description : Sum of cubes of digits of a number
* Date : 3/18/2021
*/
package lab3Assignments;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateInDMY {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date(YYYY-MM-DD) :");
		LocalDate date = LocalDate.parse(sc.next());
		LocalDate presentDate = LocalDate.now();
		Period difference = Period.between(presentDate, date);
		int days = difference.getDays();
		int month = difference.getMonths();
		int year = difference.getYears();
		System.out.println("The difference in date is : "+year+" years "+month+" Months "+days+" Days");
	}

}
