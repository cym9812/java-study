package study;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Input two numbers to divide:");
    	System.out.println("First number:");
    	int number1 = s.nextInt();
    	System.out.println("Second number:");
    	int number2 = s.nextInt();
    	System.out.println("Do you want to play it safe? [Y]/N");
    	String c = s.next();
		System.out.print(number1 + "/" + number2 + "=");
    	if (c.equals("N") || c.equals("n")) {
    	    // Divide without exception handling - may crash
    		System.out.println(divideMyNumbers(number1, number2));
    	}
    	else
    	{
    	    // Divide with exception handling
    		try {
    			System.out.println(divideMyNumbers(number1, number2));
    		}
    		catch (Exception e) {
    			System.out.println("Undefined: Divide by zero");
    		}
    		
    	}    	
    }
    
    private static int divideMyNumbers(int number1, int number2) {
    	return number1 / number2;
    }
}
