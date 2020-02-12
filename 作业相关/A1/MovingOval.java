/*
 *  ============================================================================================
 *  MovingOval.java : This class draw a circle/ellipse based on the mouse-point, the current
 *  width, the current height, the current border colour, the current fill colour,and the
 *  current moving path saved in the AnimationPanel.
 *  UPI: ycai541
 *  Name: Yimeng Cai
 *  ============================================================================================
 */
package A1Code;

import java.awt.*;

public class MovingOval extends MovingShape {
    public MovingOval(){
        super();
    }

    public MovingOval(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType){
        super(x ,y , w, h, mw, mh, c, fc, pathType);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(fillColor);
        g.fillOval(topLeft.x, topLeft.y, width, height);
        g.setColor(borderColor);
        g.drawOval(topLeft.x, topLeft.y, width, height);
        drawHandles(g);
    }

    @Override
    public boolean contains(Point p) {
        double dx, dy;
        Point EndPt = new Point(topLeft.x + width, topLeft.y + height);
        dx = (2 * p.x - topLeft.x - EndPt.x) / (double) width;
        dy = (2 * p.y - topLeft.y - EndPt.y) / (double) height;
        return dx * dx + dy * dy < 1.0;
    }
}
