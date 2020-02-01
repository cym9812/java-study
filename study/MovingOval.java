package study;
import java.awt.*;
public class MovingOval {
    private Point topLeft;
    private int width;
    private int height;
    private Color borderColor;
    private Color fillColor;
    public MovingOval(){
        topLeft = new Point(0,0);
        width = 10;
        height = 10;
        borderColor = Color.blue;
        fillColor = Color.black;
    }
    public MovingOval(Point Point, int width, int height, Color borderColor, Color fillColor){
        topLeft = Point;
        this.width = width;
        this.height = height;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }
    public String toString(){
        return String.format("(%d, %d), %d x %d", topLeft.x,topLeft.y, width,height);
    }
    public int getX() {
        return topLeft.x;
    }
    public int getY() {
        return  topLeft.y;
    }
    public void move() {
        topLeft.x += 1;
        topLeft.y += 2;
    }
    public boolean contains(java.awt.Point P){
        double a;
        double b;
        double focus1_x;
        double focus1_y;
        double focus2_x;
        double focus2_y;
        if (width > height){
            a = width / 2;
            b = height / 2;
        }else {
            a = height / 2;
            b = width / 2;
        }
        double c = Math.sqrt(Math.pow(a, 2)-Math.pow(b, 2));
        if (width > height){
            focus1_x = topLeft.x + a - c;
            focus1_y = topLeft.y - b;
            focus2_x = topLeft.x + a + c;
            focus2_y = topLeft.y - b;
        }else {
            focus1_x = topLeft.x + b;
            focus1_y = topLeft.y - a + c;
            focus2_x = topLeft.x + b;
            focus2_y = topLeft.y - a - c;
        }
        System.out.printf("%f %f %f %f%n", focus1_x,focus1_y,focus2_x,focus2_y);
        return P.distance(focus1_x, focus1_y) + P.distance(focus2_x, focus2_y) < a * 2;
    }
}
