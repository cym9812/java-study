/*
 *  ============================================================================================
 *  MovingRectangle.java : This class draw a rectangle/square based on the mouse-point, the current
 *  width, the current height, the current border colour, the current fill colour,and the
 *  current moving path saved in the AnimationPanel.
 *  UPI: ycai541
 *  Name: Yimeng Cai
 *  ============================================================================================
 */
package A1Code;

import java.awt.*;

public class MovingRectangle extends MovingShape{
    public MovingRectangle(){
        super();
    }

    public MovingRectangle(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType){
        super(x ,y , w, h, mw, mh, c, fc, pathType);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(fillColor);
        g.fillRect(topLeft.x, topLeft.y, width, height);
        g.setColor(borderColor);
        g.drawRect(topLeft.x, topLeft.y, width, height);
        drawHandles(g);
    }

    @Override
    public boolean contains(Point p) {
        return p.x >= topLeft.x && p.x <= topLeft.x + width && p.y >= topLeft.y && p.x <= topLeft.y + height;
    }
}
