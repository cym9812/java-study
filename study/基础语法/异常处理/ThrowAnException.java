package 基础语法.异常处理;
public class ThrowAnException {

	public static void main(String[] args) {
		// Let's just throw an exception for fun and catch it!
		try {
			if (1 > 0) {
                throw new java.util.InputMismatchException();
			}
            System.out.println("We never get here.");
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("Caught it!");
		}
	}

}
