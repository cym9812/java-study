/*
 *  ============================================================================================
 *  DrawedGraph.java : Extends JPanel and draw the graph
 *  UPI: ycai541
 *  Name: Yimeng Cai
 *  ============================================================================================
 */
package A2;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class DrawedGraph extends JPanel {
    private ArrayList<Integer> data;
    private double max;

    /** constructor to initialise components
     * @param data     the list of the total number of bytes that the selected source/destination host sent/received for each 2 second interval
     * @param max    the y-coordinate of the mouse position
     */
    public DrawedGraph(ArrayList<Integer> data, int max) {
        super();
        this.data = data;
        this.max = max;
        setLayout(null);
        setSize(1000, 350);
        setBackground(Color.white);
        setVisible(true);
        JLabel volume = new JLabel("Volume [bytes]");
        add(volume);
        volume.setBounds(15, 5, 100, 20);
        JLabel time = new JLabel("Time [s]");
        add(time);
        time.setBounds(480, 305, 100, 20);
        JLabel tick = new JLabel("0");
        add(tick);
        tick.setBounds(45, 285, 20, 20);
        tick = new JLabel("0");
        add(tick);
        tick.setBounds(30, 265, 20, 20);
        for (int i = 0; i < 13; i++) {
            tick = new JLabel(String.valueOf(50 + i * 50));
            add(tick);
            tick.setBounds(115 + i * 68, 280, 30, 30);
        }
        JLabel y_tick;
        int temp;
        for (int j = 0; j < 5; j++){
            if (max > 1000){
                temp = max / 1000;
                temp = temp / 5 * (5 - j);
                y_tick = new JLabel(String.valueOf(temp) + "k");
                add(y_tick);
                y_tick.setBounds(10, 35 + j * 45,50, 30);
            } else {
                temp = max;
                temp = temp / 5 * (5 - j);
                y_tick = new JLabel(String.valueOf(temp));
                add(y_tick);
                y_tick.setBounds(10, 35 + j * 45,50, 30);
            }
        }


    }

    /** Draw the coordinate system and ticks on the x-axis, Plot the bytes data
     * @param  g        the graphics control
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(45, 275, 950, 275);
        g.drawLine(50, 280, 50, 25);
        for (int i = 125; i <= 950; i+=68){
            g.drawLine(i, 275, i, 280);
        }
        for (int j = 0; j < 6; j++){
            g.drawLine(50, 275 - j * 45, 45, 275 - j * 45);
        }
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red);
        double highest = 240;
        double currentHigh;
        double temp;
        for (int i = 0; i < data.size(); i++){
            temp = data.get(i);
            currentHigh = temp / max * highest;
            g2d.draw(new Rectangle2D.Double(50 + i * 2.745 , 275 - currentHigh, (double) (900 / data.size()), currentHigh));
        }
    }
}

