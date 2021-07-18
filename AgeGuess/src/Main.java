import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ageGuess;
		String name;
		Scanner sc = new Scanner(System.in); // a new Scanner object sc is declared
		
		System.out.print("Please enter the name:");
		name=sc.nextLine(); // Accept the name
		
		System.out.print("Please enter the age:");
		ageGuess=sc.nextInt(); // Accept the age
		
		System.out.println("Name is" +name); // Displays the name
		System.out.println("Age is" +ageGuess); // Displays the age guess
	}

}
