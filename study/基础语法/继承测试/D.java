package 基础语法.继承测试;

public class D extends C {
    public static void f() {
        System.out.println("D-static-f");
    }

    @Override
    public void h() {
        System.out.println("D-h");
    }
}
