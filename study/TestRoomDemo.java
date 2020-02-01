package study;
import java.util.Scanner;
import java.io.PrintStream;

public class TestRoomDemo {

	public static void main(String[] args) {
		PrintStream p = System.out; // Lazy programmers...
		Scanner s = new Scanner(System.in);
		p.println("Please enter your first name: ");
		String firstName = s.next();
		p.println("Please enter your last name: ");
		String lastName = s.next();
		String upi = firstName.substring(0, 1) 
				   + lastName.substring(0, 3)
				   + "123";
		upi = upi.toLowerCase();
		p.println("Your UPI could be: " + upi);		
		if (upi.compareTo("whsu014") == 0) {
			p.println("You're William and meant to supervise MLT3");
		}
		else if (upi.compareTo("csee015") <= 0) {
			p.println("You should have been in 206-220.");
		}
		else if (upi.compareTo("gwis003") <= 0) {
			p.print("You should have been in ");
			String theatre = "ALR1/421W-201";
			p.println(theatre.substring(5));
		}
		else if (upi.compareTo("jpet145") <= 0) {
			p.print("You should have been in ");
			String theatre = "HSB370/201N-370";
			int slashPos = theatre.indexOf("/");
			p.println(theatre.substring(slashPos + 1));
		}
		else if (upi.compareTo("mhos205") <= 0) {
			p.print("You should have been in ");
			String theatre = "MLT3/303-101";
			int slashPos = theatre.indexOf("/");
			p.print(theatre.substring(slashPos + 1));
			p.print(" known as ");
			p.println(theatre.substring(0,slashPos));			
		}
		else if (upi.compareTo("safr034") <= 0) {
			p.print("You should have been in ");
			String theatre = "OCH1/104-G53";
			int slashPos = theatre.indexOf("/");
			p.print(theatre.substring(slashPos + 1));
			p.print(" known as ");
			p.println(theatre.substring(0,slashPos));			
		}
		else if (upi.compareTo("vwan157") <= 0) {
			p.print("You should have been in ");
			String theatre = "OCH2/104-G54";
			int slashPos = theatre.indexOf("/");
			p.print(theatre.substring(slashPos + 1));
			p.print(" known as ");
			p.println(theatre.substring(0,slashPos));			
		}
		else if (upi.compareTo("vwon320") >= 0) {
			p.println("You should have been in 423-348.");
		}
		else
		{
			p.println("Were you really meant to sit the test?");
		}
	}

}
