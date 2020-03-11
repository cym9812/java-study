package practice;
import javax.swing.SwingUtilities;

public class RunRegexChecker implements Runnable {
	public void run() {
		RegexChecker r = new RegexChecker();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new RunRegexChecker());
	}

}