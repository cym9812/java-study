package 基础语法;

public class IncrementTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = ++a; //先自增再赋值
        int d = b++; //先赋值再自增
        System.out.printf("A=%d%n", a);
        System.out.printf("B=%d%n", b);
        System.out.printf("C=%d%n", c);
        System.out.printf("D=%d%n", d);
    }
}
