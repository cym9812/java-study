package practice;
import java.util.Scanner;
import java.io.PrintStream;

public class UPICheck {

	public static void main(String[] args) {
		PrintStream p = System.out; // Lazy programmers...
		Scanner s = new Scanner(System.in);
		p.println("Please enter a UPI to check: ");
		String upiCandidate = s.next();
		p.println("You entered \"" + upiCandidate + "\".");
		if (upiCandidate.matches("^[a-z]{3,4}\\d{3}$")) {
			p.println("Looks like a UPI to me!");
		}
		else
		{
			p.println("Sorry, that's not a UPI.");
		}
	}

}
