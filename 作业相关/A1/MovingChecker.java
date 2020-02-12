/*
 *  ============================================================================================
 *  MovingChecker.java : This class draw a checker pattern based on the mouse-point, the current
 *  width, the current height, the current border colour, the current fill colour,and the
 *  current moving path saved in the AnimationPanel.
 *  UPI: ycai541
 *  Name: Yimeng Cai
 *  ============================================================================================
 */
package A1Code;

import java.awt.*;
import java.util.*;

public class MovingChecker extends MovingShape{
    private Random r = new Random();
    private int horizontal = r.nextInt(7) + 2; //generate a random number between 2 to 8
    private int vertical = r.nextInt(7) + 2;

    public MovingChecker(){
        super();
    }

    public MovingChecker(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType){
        super(x ,y , w, h, mw, mh, c, fc, pathType);
    }

    @Override
    public void draw(Graphics g) {
        int block_x = width / horizontal;
        int block_y = height / vertical;
        for (int i = 0; i < vertical; i++){
            for (int j = 0; j < horizontal; j++){
                if ((i + j) % 2 != 0){
                    g.setColor(borderColor);
                    g.fillRect(topLeft.x + j * block_x, topLeft.y + i * block_y, block_x, block_y);
                }else {
                    g.setColor(fillColor);
                    g.fillRect(topLeft.x + j * block_x, topLeft.y + i * block_y, block_x, block_y);
                }
            }
        }
        drawHandles(g);
    }

    @Override
    public boolean contains(Point p) {
        return p.x >= topLeft.x && p.x <= topLeft.x + width && p.y >= topLeft.y && p.x <= topLeft.y + height;
    }
}
