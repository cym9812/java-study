package 基础语法;

public class TypeTransform {
    public static void main(String[] args) {
        // 自动转换
        float f = 10.123f;
        double d = f;
        System.out.printf("%f\n", f);
        System.out.printf("%f\n", d);

        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f1 = l;
        double d1 = f1;
        System.out.printf("%d\n", b);
        System.out.printf("%d\n", s);
        System.out.printf("%d\n", i);
        System.out.printf("%d\n", l);
        System.out.printf("%f\n", f1);
        System.out.printf("%f\n", d1);
        System.out.println("--------");
        // byte b = 10;
        // char c = b;

        //强制转换
        int k = (int) 88.88;
        System.out.println(k);

        int k1 = 10;
        k1 += 5.5;
        System.out.println(k1);
        System.out.println("--------");
        //计算转换
        int x = 10;
        int y = 3;
        System.out.println(x / y); // 3
        double z = 3;
        System.out.println(x / z); // 3.333...
        System.out.println("--------");

    }
}
