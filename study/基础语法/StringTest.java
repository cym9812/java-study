package 基础语法;

public class StringTest {
    public static void main(String[] args) {
        // 创建
        String s1 = new String();
        System.out.println(s1);
        char[] chs = {'a', 'b','c'};
        String s2 = new String(chs);
        System.out.println(s2);
        byte[] bys = {97,98,99};
        String s3 = new String(bys);
        System.out.println(s3);

        // 拼接
        System.out.println("ab" + "bc");
        System.out.println("abc" + 123);
        System.out.println(123 + "abc");
        System.out.println("abc" + 99 + 1);
        System.out.println(1 + 99 + "abc");
        System.out.println();

        // equal ==
        // 基本类型：数值
        // 引用类型：地址
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a == b); // a与b都指向在常量池中的同一个“abc”，内存地址一样
        System.out.println(b == c); // 不同地址
        System.out.println(b.equals(c)); // 相同值
        System.out.println("------------");

        // 比较
        // 指定的数与参数相等返回0
        // 指定的数小于参数返回 -1
        // 指定的数大于参数返回 1
        String e = "djqwehfuib";
        String g = "qwerwqeqwq";
        System.out.println(e.compareTo(g));
        System.out.println("------------");

        // 定位
        String h = "aabbcd";
        System.out.println(h.length());
        System.out.println(h.charAt(0));
        System.out.println(h.charAt(0) == h.charAt(1));

        // 判断
        String l = "AAFNESJFNibfisundfnesfu213124";
        int big = 0;
        int small = 0;
        int num = 0;
        for (char i : l.toCharArray()) {
            if (i >= 'A' && i <= 'Z') {
                big++;
            } else if (i >= 'a' && i <= 'z') {
                small++;
            } else {
                num++;
            }
        }
        System.out.printf("big:%d\nsmall:%d\nnum:%d\n", big, small, num);
        System.out.println("------------");

        // 反转
        String m = "abcdefg";
        String n = "";
        for (int i = m.length(); i >= 0; i--){
            n += m.charAt(i);
        }

        System.out.println(n);



    }
}
