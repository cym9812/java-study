/*
 *  ============================================================================================
 *  Graph.java : Extends JPanel and draw the graph
 *  UPI: ycai541
 *  Name: Yimeng Cai
 *  ============================================================================================
 */
package A2;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Graph extends JPanel {

    /** constructor to initialise components
     */
    public Graph(){
        super();
        setLayout(null);
        setSize(1000, 350);
        setBackground(Color.white);
        setVisible(true);
        JLabel volume = new JLabel("Volume [bytes]");
        add(volume);
        volume.setBounds(15,5, 100, 20);
        JLabel time = new JLabel("Time [s]");
        add(time);
        time.setBounds(480,305, 100, 20);
        JLabel tick = new JLabel("0");
        add(tick);
        tick.setBounds(45, 285, 20, 20);
        tick = new JLabel("0");
        add(tick);
        tick.setBounds(30, 265, 20, 20);
        for (int i = 0; i < 12; i++){
            tick = new JLabel(String.valueOf(50 + i * 50));
            add(tick);
            tick.setBounds(115 + i * 75, 280, 30, 30);
        }

    }

    /** Draw the coordinate system and ticks on the x-axis
     * @param  g        the graphics control
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(45, 275, 950, 275);
        g.drawLine(50, 280, 50, 25);
        for (int i = 125; i <= 950; i+=75){
            g.drawLine(i, 275, i, 280);
        }
    }
}
