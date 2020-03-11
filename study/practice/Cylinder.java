package practice;

public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        height = 1.0;
    }
    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolumne(){
        return height * getArea();
    }
}
