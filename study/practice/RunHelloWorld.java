package practice;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class RunHelloWorld implements Runnable {
    public void run() {
		HelloWorld h = new HelloWorld();
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        h.setSize(300,150);
        h.setVisible(true);    	
    }
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new RunHelloWorld());
	}

}
