package practice;

public class Myclass {
    private int x = 0;
    public Myclass() {
        x = 1;
    }
    public void myMethod(int y) {
        x++;
        if (y > 0) {
            int x = 7;
            switch (y) {
                case 4:
                    x = 4;
                    break;
                case 5:
                    x = 5;
                case 6:
                    x++;
                    break;
            }
            System.out.print(x);
        }
        System.out.println(x);
    }
}
