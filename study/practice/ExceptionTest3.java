package practice;
import java.util.Scanner;

public class ExceptionTest3 {

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
    	catch (ArithmeticException e) {
    	    System.out.println("Not even a hero can divide by 0");
    	}
    	catch (java.util.InputMismatchException e) {
    		System.out.println("Dumb and dumber - not a number? ");
    	}
    	System.out.println("This is the ordinary end of the program!");
    }
    
    private static int divideMyNumbers(int number1, int number2) {
    	return number1 / number2;
    }
}
