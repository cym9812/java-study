/*
 *  ============================================================================================
 *  MovingGradient.java : This class draw a gradient-rectangle based on the mouse-point, the current
 *  width, the current height, the current border colour, the current fill colour,and the
 *  current moving path saved in the AnimationPanel.
 *  UPI: ycai541
 *  Name: Yimeng Cai
 *  ============================================================================================
 */
package A1Code;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MovingGradient extends MovingShape {
    public MovingGradient(){
        super();
    }

    public MovingGradient(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType){
        super(x ,y , w, h, mw, mh, c, fc, pathType);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint lefttoright = new GradientPaint(topLeft.x, topLeft.y + height, fillColor, topLeft.x + width, topLeft.y + height, borderColor);
        g2d.setPaint(lefttoright);
        g2d.fill(new Rectangle2D.Double(topLeft.x, topLeft.y, width, height));
        drawHandles(g2d);
    }

    @Override
    public boolean contains(Point p) {
        return p.x >= topLeft.x && p.x <= topLeft.x + width && p.y >= topLeft.y && p.x <= topLeft.y + height;
    }
}
