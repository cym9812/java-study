package practice;
import java.util.Scanner;

public class DoNotDoThis {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
    	System.out.println("Choose your flavour:");
		System.out.println("Vanilla: 0");
		System.out.println("Chocolate: 1");
		int c = s.nextInt();
		try {
			int dummy = 1/c;
			System.out.println("You chose chocolate.");
		}
		catch (Exception e) {
			System.out.println("You chose vanilla.");
		}		
	}

}
