package practice;
import javax.swing.SwingUtilities;

public class RunListOWords implements Runnable {
	public void run() {
		ListOWords l = new ListOWords();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new RunListOWords());
	}

}
