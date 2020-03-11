package 基础语法;

public class TrinocularOperator {
    public static void main(String[] args) {
        typeA();
        typeB();
    }

    public static void typeA() {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println(max);
    }

    public static void typeB() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(a < b ? a > c ? 10 : 20 : 30); // true true = 20
        System.out.println(a < b ? a > d ? 10 : 20 : 30); // true false = 20
        System.out.println(a > b ? a < d ? 10 : 20 : 30); //false true = 30
        System.out.println(a > b ? a > d ? 10 : 20 : 30); //false false = 30
    }
}
