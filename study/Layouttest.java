package study;
import java.awt.*;
import javax.swing.*;
public class Layouttest {
        JFrame jframe = new JFrame("搜索");

        JButton jButton = new JButton("按钮1");
        JButton jButton2 = new JButton("按钮2");
        JButton jButton3 = new JButton("按钮3");
//    JButton jButton4 = new JButton("按钮4");

        public Layouttest() {

            init();
        }

        private void init()
        {

            GridBagLayout gridBagLayout = new GridBagLayout();
            jframe.setLayout(gridBagLayout);
            GridBagConstraints constraints = new  GridBagConstraints();

            constraints.fill = GridBagConstraints.BOTH;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;


            constraints.gridheight = 1;
            constraints.gridwidth = GridBagConstraints.REMAINDER;
            gridBagLayout.setConstraints(jButton, constraints);
            jframe.add(jButton);

            constraints.gridheight = 2;
            constraints.gridwidth = 1;
            gridBagLayout.setConstraints(jButton2, constraints);
            jframe.add(jButton2);

            constraints.gridheight = 1;
            constraints.gridwidth = GridBagConstraints.REMAINDER;
            gridBagLayout.setConstraints(jButton3, constraints);
            jframe.add(jButton3);
//        gridBagLayout.setConstraints(jButton4, constraints);
//        jframe.add(jButton4);


            jframe.setSize(jframe.getPreferredSize());
            jframe.setVisible(true);
//        jframe.pack();
        }
    }
