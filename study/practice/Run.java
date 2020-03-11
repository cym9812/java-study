package practice;
import javax.swing.SwingUtilities;
public class Run implements Runnable{
    public void run() {
        Layouttest f = new Layouttest();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Run());
    }

}
