package study;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Input two numbers to divide:");
    	System.out.println("First number:");
    	try {
        	int number1 = s.nextInt();
        	System.out.println("Second number:");
        	int number2 = s.nextInt();
		    System.out.print(number1 + "/" + number2 + "=");
			System.out.println(divideMyNumbers(number1, number2));
    	}
    	catch (Exception e) {
    			System.out.println("A problem occurred: "
    			    + e.toString() + " with message '"
    	            + e.getMessage() + "'");
    	}    	
    }
    
    private static int divideMyNumbers(int number1, int number2) {
    	return number1 / number2;
    }
}
