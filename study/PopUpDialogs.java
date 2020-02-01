package study;
import javax.swing.JOptionPane;

public class PopUpDialogs {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name 
				+ "!\nNow I know who you are!", "Greeting", 
				JOptionPane.INFORMATION_MESSAGE);
	}

}
