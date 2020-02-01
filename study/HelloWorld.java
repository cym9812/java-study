package study;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class HelloWorld extends JFrame implements ActionListener {
    private final JLabel label;
    private final JButton button;
	
    public HelloWorld() {
    	super("Hello World with Swing GUI components");
    	setLayout(new FlowLayout());
    	label = new JLabel("Hey you, push my button!");
    	add(label);
    	button = new JButton("Push me!");    	
    	button.addActionListener(this);
    	add(button);
    }
    
    public void actionPerformed(ActionEvent event) {
    	label.setText("Thanks!");
    }
    
    
}
