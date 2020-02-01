package study;

public class MySubLine extends MyPoint {
    private MyPoint begin = new MyPoint();
    private MyPoint end = new MyPoint();
    public MySubLine(int a, int b, int c, int d){
        begin.setX(a);
        begin.setY(b);
        end.setX(c);
        end.setY(d);
    }
    public MySubLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }
    public double getLength(){
        return begin.distance(end);
    }
    @Override
    public String toString() {
        return String.format("(%d, %d) to (%d, %d)", begin.getX(), begin.getY(), end.getX(), end.getY());
    }
}
