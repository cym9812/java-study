package study;

public class 三目运算符嵌套 {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = a < b? a>d? 10:20:30;

        System.out.print(e);
    }
}
