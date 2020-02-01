package study;
public class RegexReplacer {

	public static void main(String[] args) {
		String input = "We have 4,999 apples at only $4.99 a kg. $4.99 I say! Only $4.99!";
        String newPrice = "5.49";
        input = input.replaceAll("4\\.99", newPrice); // What happens if you use "4.99"?
        System.out.println(input);
	}

}
