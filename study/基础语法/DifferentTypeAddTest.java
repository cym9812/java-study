package 基础语法;

public class DifferentTypeAddTest {
    public static void main(String[] args) {
        // 提升顺序 byte,short,char -> int -> long -> float -> double
        int a = 10;
        char b = '2'; // ASCII = 50
        int c = a + b; // 50 + 10
        System.out.println(c);

        char d = '5'; // ASCII = 53
        char e = '1'; // ASCII = 49
        int f = d + e; // 53 + 49
        System.out.println(f);

        char g = 5;
        double h = 10.5;
        double i = g + h;
        System.out.println(i);
    }
}
