package 基础语法;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String y = sc.next();
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
