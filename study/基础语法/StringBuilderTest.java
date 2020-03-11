package 基础语法;

import java.util.Arrays;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println("s:" + s);
        System.out.println("s.length():"+s.length());
        StringBuilder t = new StringBuilder("abc");
        System.out.println("t:" + t);
        System.out.println("t.length():"+t.length());

        t.append("abc");
        System.out.println("t:" + t);
        System.out.println("t.length():"+t.length());

        t.append(100.5);
        System.out.println("t:" + t);
        System.out.println("t.length():"+t.length());

        t.reverse();
        System.out.println("t:" + t);

        // StringBuilder -> String
        String st = t.toString();
        System.out.println("st:"+st);

        // String -> StringBuilder
        String a = "abcdefg";
        StringBuilder b = new StringBuilder(a);
        System.out.println("b:" + b);


        System.out.println(arrayToSt(new int[] {1,2,3}));

        System.out.println(stringReverse("abcdefg"));

    }
    public static String arrayToSt(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i : arr){
            sb.append(i).append(", ");
        }
        sb.replace(sb.length() - 2,sb.length() - 1, "]");
        return sb.toString();
    }

    public static String stringReverse(String s){
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        return sb.toString();

        return new StringBuilder(s).reverse().toString();

    }
}
