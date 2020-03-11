package 基础语法;

// 静态成员方法只能访问静态成员

public class StaticTest {
    //非静态成员变量
    private String name = "abc";
    //静态成员变量
    private static String university = "大学";

    //非静态成员方法
    public void fun1() {

    }

    //非静态成员方法
    public void fun2() {
        System.out.println(name);
        System.out.println(university);
        fun1();
        fun3();
    }

    //静态成员方法
    public static void fun3() {

    }

    //静态成员方法
    public static void fun4() {
        //System.out.println(name);
        System.out.println(university);
        //fun1();
        fun3();
    }
}
