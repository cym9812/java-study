package practice;

import java.awt.*;

public class MovingRectangle {
    private java.awt.Point topLeft;
    private int width;
    private int height;
    private java.awt.Color borderColor;
    private java.awt.Color fillColor;
    public MovingRectangle(){
        topLeft = new java.awt.Point(0,0);
        width = 10;
        height = 10;
        borderColor = Color.blue;
        fillColor = Color.black;
    }
    public MovingRectangle(java.awt.Point Point, int width, int height, java.awt.Color borderColor, java.awt.Color fillColor){
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
        return P.x <= topLeft.x + width && P.x >= topLeft.x && P.y >= topLeft.y && P.y <= topLeft.y + height;
    }
}
