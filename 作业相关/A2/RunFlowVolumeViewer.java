/*
 *  ============================================================================================
 *  UPI: ycai541
 *  Name: Yimeng Cai
 *  ============================================================================================
 */
package A2;
import javax.swing.SwingUtilities;

public class RunFlowVolumeViewer implements Runnable{
    public void run() {
        FlowVolumeViewer f = new FlowVolumeViewer();
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new RunFlowVolumeViewer());
    }

}
