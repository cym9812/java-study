package practice;
import java.awt.*;
public abstract class SimpleMovingShape {
    protected Point topLeft;
    protected int width;
    protected int height;
    public SimpleMovingShape(){
        topLeft = new Point(0,0);
        width = 0;
        height = 0;
    }

    public SimpleMovingShape(Point p, int width, int height){
        topLeft = p;
        this.width = width;
        this.height = height;
    }
    public int getX(){
        return topLeft.x;
    }
    public int getY(){
        return topLeft.y;
    }
    public void setX(int x){
        topLeft.x = x;
    }
    public void setY(int y){
        topLeft.y = y;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString(){
        return String.format("(%d, %d) %d x %d", topLeft.x, topLeft.y, width, height);
    }

    public void move(){
        topLeft.setLocation(topLeft.x + 1, topLeft.y + 2);
    }

    public abstract void draw();
}
