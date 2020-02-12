/*
 *  ============================================================================================
 *  MovingShapePattern.java : This class draw a pattern based on the mouse-point, the current
 *  width, the current height, the current border colour, the current fill colour,and the
 *  current moving path saved in the AnimationPanel.
 *  UPI: ycai541
 *  Name: Yimeng Cai
 *  ============================================================================================
 */
package A1Code;

import java.awt.*;

public class MovingShapePattern extends MovingShape{
    public MovingShapePattern(){
        super();
    }

    public MovingShapePattern(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType){
        super(x ,y , w, h, mw, mh, c, fc, pathType);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(borderColor);
        g.drawOval(topLeft.x, topLeft.y, width, height);
        g.drawOval(topLeft.x + width / 3, topLeft.y, width / 3, height);
        g.drawOval(topLeft.x, topLeft.y + height / 3, width, height / 3);
        drawHandles(g);
    }

    @Override
    public boolean contains(Point p) {
        return p.x >= topLeft.x && p.x <= topLeft.x + width && p.y >= topLeft.y && p.x <= topLeft.y + height;
    }
}
