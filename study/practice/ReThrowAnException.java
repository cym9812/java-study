package practice;
public class ReThrowAnException {

	public static void main(String[] args) {
		// Let's just throw an exception for fun and catch it!
		try {
			try {
				if (1 > 0) {
	                throw new java.util.InputMismatchException();
				}
	            System.out.println("We never get here.");
			}
			catch (java.util.InputMismatchException e) {
				System.out.println("Caught it!");
				throw e;
			}
		}
		catch (Exception e) {
			System.out.println("And caught it again!");
		}
	}

}
