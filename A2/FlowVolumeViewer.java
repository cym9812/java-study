/*
 *  ============================================================================================
 *  FlowVolumeViewer.java : Extends JFrame and contains a JMenuBar which has open and quit,
 *  a ButtonGroup which have two RadioButtons, a comboBox to choose IP and a panel where graph will be plot
 *  UPI: ycai541
 *  Name: Yimeng Cai
 *  ============================================================================================
 */
package A2;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class FlowVolumeViewer extends JFrame implements ItemListener {
    private Graph graph;
    private DrawedGraph drawedGraph;
    private JPanel radioButtonPanel;
    private Tracefile tracefile;
    private JComboBox<String> comboBox;
    private ArrayList<String> source;
    private ArrayList<String> destination;
    private JRadioButton source_option;
    private JRadioButton destination_option;

    /** constructor to initialise components
     */
    public FlowVolumeViewer(){
        super("Flow volume viewer");
        setSize(1000,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setMenuBar();
        setButtonGroup();
        add(radioButtonPanel);
        radioButtonPanel.setLocation(0, 0);
        setGraph();
        add(graph);
        graph.setLocation(0, 100);
        setComboBox();
        add(comboBox);
        comboBox.setLocation(400,30);
    }

    /** Set up the MenuBar
     */
    private void setMenuBar(){
        JMenuItem open = new JMenuItem("Open trace file");
        JMenuItem quit = new JMenuItem("Quit");
        JMenu menu = new JMenu("File");
        menu.add(open);
        menu.add(quit);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(menu);
        open.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e){
                        JFileChooser fileChooser = new JFileChooser(".");
                        int retval = fileChooser.showOpenDialog(FlowVolumeViewer.this);
                        if (retval == JFileChooser.APPROVE_OPTION) {
                            File f = fileChooser.getSelectedFile();
                            tracefile = new Tracefile(f.getAbsolutePath());
                            source = tracefile.getSource();
                            destination = tracefile.getDestination();
                            if (source_option.isSelected()){
                                updateComboBox(source);
                            }else {
                                updateComboBox(destination);
                            }
                            source_option.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    if (source_option.isSelected()){
                                        updateComboBox(source);
                                    }
                                }
                            });
                            destination_option.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    if (destination_option.isSelected()){
                                        updateComboBox(destination);
                                    }
                                }
                            });
                        }
                    }
                }
        );
        quit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
        });
    }

    /** Set up the ButtonGroup
     */
    private void setButtonGroup(){
        radioButtonPanel = new JPanel();
        radioButtonPanel.setSize(200, 100);
        radioButtonPanel.setLayout(new GridBagLayout());
        GridBagConstraints button = new GridBagConstraints();
        button.gridx = 0;
        button.gridy = GridBagConstraints.RELATIVE;
        button.anchor = GridBagConstraints.WEST;
        ButtonGroup buttonGroup = new ButtonGroup();
        source_option = new JRadioButton("Source hosts");
        source_option.setSelected(true);
        buttonGroup.add(source_option);
        radioButtonPanel.add(source_option, button);
        destination_option = new JRadioButton("Destination hosts");
        buttonGroup.add(destination_option);
        radioButtonPanel.add(destination_option, button);

    }

    /** Set up the ComboBox
     */
    private void setComboBox(){
        comboBox = new JComboBox<String>();
        comboBox.setSize(120, 30);
        comboBox.setVisible(false);
        comboBox.addItemListener(this);
    }

    /** Update the ComboBox with the selected list of IPs
     * @param  list        the selected list of IPs
     */
    private void updateComboBox(ArrayList<String> list){
        comboBox.setVisible(true);
        comboBox.removeAllItems();
        for (String i : list){
            comboBox.addItem(i);
        }

    }

    /** Set up the initial graph
     */
    private void setGraph(){
        graph = new Graph();
    }

    /** Update the graph with processed data
     * @param  data        the total number of bytes that the selected source/destination host sent/received for each 2 second interval
     * @param  max         the maximum number of bytes in the data
     */
    private void updateGraph(ArrayList<Integer> data, int max){
        try{
            remove(graph);
            remove(drawedGraph);
        }catch (Exception e){

        }
        drawedGraph = new DrawedGraph(data, max);
        drawedGraph.repaint();
        add(drawedGraph);
        drawedGraph.setLocation(0, 100);
    }

    /** Get selected IP and use it to update graph
     * @param  e    ItemEvent
     */
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            ArrayList<Integer> IPData;
            if (source_option.isSelected()){
                IPData = tracefile.getSourceData(e.getItem().toString());
            }else {
                IPData = tracefile.getDestinationData(e.getItem().toString());
            }
            int max = tracefile.getMax(IPData);
            updateGraph(IPData, max);
        }
    }
}
