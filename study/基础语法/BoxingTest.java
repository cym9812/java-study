package 基础语法;

public class BoxingTest {
    public static void main(String[] args) {

        // 已弃用方法
        Integer i1 = new Integer(10);
        System.out.println(i1);

        Integer i2 = new Integer("100");
        System.out.println(i2);
        System.out.println("-----------");

        // Integer i3 = new Integer("abc");

        // 推荐方法
        Integer i3 = Integer.valueOf(10);
        System.out.println(i3);

        Integer i4 = Integer.valueOf("100");
        System.out.println(i4);

        // NumberFormatException
        // Integer i5 = Integer.valueOf("abc");
        // System.out.println(i5);
        System.out.println("-----------");

        // int -> String
        int num = 100;
        String s1 = String.valueOf(num);
        System.out.println(s1);
        System.out.println("-----------");

        //  String -> int
        String s2 = "100";
        Integer i = Integer.valueOf(s2);
        int x1 = i.intValue();
        System.out.println(x1);

        int x2 = Integer.parseInt("100");
        System.out.println(x2);
        System.out.println("-----------");

        String a = "123";
        int b = 1;
        Integer d = new Integer(b);
        String c = a + b;
        System.out.println(d.toString());
        System.out.println("-----------");

        // == equals
        Integer e = 123;
        System.out.println(e == new Integer(123));
        System.out.println(e == 123);
        System.out.println(e.equals(new Integer(123)));
        System.out.println(e.equals(123));

    }
}
