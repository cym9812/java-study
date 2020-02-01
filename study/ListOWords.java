package study;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class ListOWords extends JFrame implements ActionListener {
    private final JLabel label;
    private final JButton button;
    private final JTextField textField;
    private final JList<String> wordList;
    private final JCheckBox checkBoxReverseString;
    private final JPanel radioButtonPanel;
    private final ButtonGroup radioButtons;
    private final JRadioButton radioButtonNormalCase;
    private final JRadioButton radioButtonUpperCase;
    private final JRadioButton radioButtonLowerCase;

    public ListOWords() {
    	super("Listing words in all sorts of ways");
    	setLayout(new FlowLayout());
    	setSize(300,500);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Font font = new Font("Sans-serif", Font.PLAIN, 20);
    	label = new JLabel("New word to add");
    	label.setFont(font);
    	add(label);
    	textField = new JTextField(10);
    	textField.setFont(font);
    	add(textField);
    	button = new JButton("Add");    	
    	button.addActionListener(this);
    	button.setFont(font);
    	add(button);
    	checkBoxReverseString = new JCheckBox("Reverse string");
    	add(checkBoxReverseString);
    	// The following panel will hold the radio buttons,
    	// left-aligned
    	radioButtonPanel = new JPanel();
    	radioButtonPanel.setLayout(new GridBagLayout());
    	GridBagConstraints c = new GridBagConstraints();
    	c.gridx = 0;
    	c.gridy = GridBagConstraints.RELATIVE;
    	c.anchor = GridBagConstraints.WEST;
    	// Group the buttons so only one of them can be checked
        radioButtons = new ButtonGroup();
    	// Now create the buttons so only one of them can be checked
        // and add them to group and panel
    	radioButtonNormalCase = new JRadioButton("Leave case as is");
    	radioButtonNormalCase.setFont(font);
     	radioButtonNormalCase.setSelected(true);
        radioButtons.add(radioButtonNormalCase);
        radioButtonPanel.add(radioButtonNormalCase, c);
    	radioButtonUpperCase = new JRadioButton("All upper case");
    	radioButtonUpperCase.setFont(font);
        radioButtons.add(radioButtonUpperCase);
    	radioButtonPanel.add(radioButtonUpperCase, c);
    	radioButtonLowerCase = new JRadioButton("All lower case");
    	radioButtonLowerCase.setFont(font);
        radioButtons.add(radioButtonLowerCase);
    	radioButtonPanel.add(radioButtonLowerCase, c);
    	add(radioButtonPanel);
        // Note: We don't add the button group - we've already added
        // its buttons!
        wordList = new JList<String>(new DefaultListModel<String>());
    	wordList.setFont(font);
        wordList.setVisibleRowCount(25);
        wordList.setFixedCellHeight(25);
        wordList.setFixedCellWidth(280);
        add(new JScrollPane(wordList));
    	setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
    	String newWord = textField.getText();
    	if (checkBoxReverseString.isSelected()) {
    		String reverseWord = "";
    		for (int i = newWord.length() - 1; i >= 0; i--) {
    			reverseWord += newWord.charAt(i);
    		}
    		newWord = reverseWord;
    	}
    	if (radioButtonUpperCase.isSelected()) {
    		newWord = newWord.toUpperCase();
    	}
    	if (radioButtonLowerCase.isSelected()) {
    		newWord = newWord.toLowerCase();
    	}
    	((DefaultListModel)(wordList.getModel())).addElement(newWord);
    }
    
}
