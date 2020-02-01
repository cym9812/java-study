package study;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegexChecker extends JFrame implements ActionListener {
    private final JLabel labelRegex;
    private final JLabel labelString;
    private final JLabel labelResult;
    private final JButton check;
    private final JTextField textFieldRegex;
    private final JTextField textFieldString;

    public RegexChecker() {
    	super("Check your regexes here");
    	setLayout(new FlowLayout());
    	setSize(1000,400);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Font font = new Font("Sans-serif", Font.PLAIN, 20);
    	labelRegex = new JLabel("Regex to test:");
    	labelRegex.setFont(font);
    	add(labelRegex);
    	textFieldRegex = new JTextField(60);
    	textFieldRegex.setFont(font);
    	add(textFieldRegex);
    	labelString = new JLabel("String to match:");
    	labelString.setFont(font);
    	add(labelString);
    	textFieldString = new JTextField(60);
    	textFieldString.setFont(font);
    	add(textFieldString);
    	check = new JButton("Check");    	
    	check.addActionListener(this);
    	check.setFont(font);
    	add(check);
    	labelResult = new JLabel("");
    	labelResult.setFont(font);
    	add(labelResult);
    	setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
    	String regex = textFieldRegex.getText().trim();
    	String testString = textFieldString.getText().trim();
    	try {
        	if (testString.matches(regex)) {
        		labelResult.setText("Regex " + regex + " matches \"" + testString + "\"!");
        	}
        	else
        	{
        		labelResult.setText("Regex " + regex + " does not match \"" + testString + "\"!");
        	}
        }
        catch (Exception e) {
    		labelResult.setText("Check your regex!");
        }	
    }    
}
