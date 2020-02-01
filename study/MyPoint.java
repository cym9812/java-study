package study;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint(){
        x = 0;
        y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(int a, int b){
        return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
    }
    public double distance(MyPoint another){
        return Math.sqrt(Math.pow(x - another.getX(), 2) + Math.pow(y - another.getY(), 2));
    }
    public double distance(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public boolean isNearBy(MyPoint another){
        return distance(another) < 5;
    }
    public String toString() {
        return String.format("(%d, %d)%n", x, y);
    }
}
