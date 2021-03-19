
/**
* Name : Neelanjan Datta
* Description : Details of a person
* Date : 3/13/2021
*/
package lab1Assignments;

public class MyBio {
	

	private static String location;
	private static String personName;
	private static String contactEmailId;
	private static String contactNumber;

	public static void main(String[] args) {
		getInput("Neelanjan Datta", "Kolkata", "908131@cognizant.com", "9433303953");
		showOutput();

	}

	private static void showOutput() {
		System.out.println("Person Name : "+personName);
		System.out.println("Location : "+location);
		System.out.println("Email : "+contactEmailId);
		System.out.println("Contact : "+contactNumber);
		
	}

	private static void getInput(String pName, String loc, String em, String con) {
		personName = pName;
		location = loc;
		contactEmailId = em;
		contactNumber = con;
		
	}

}
