package study;

public class Myline {
    private MyPoint begin;
    private MyPoint end;
    public Myline(int a, int b, int c, int d){
        begin = new MyPoint(a, b);
        end = new MyPoint(c, d);
    }
    public Myline(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }
    public String toString(){
        return String.format("(%d, %d) to (%d, %d)", begin.getX(), begin.getY(), end.getX(), end.getY());
    }
    public double getLength(){
        return begin.distance(end);
    }
}
