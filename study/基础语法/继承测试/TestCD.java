package 基础语法.继承测试;

public class TestCD {
    public static void main(String[] args) {
        C a1 = new C();
        C b1 = new D();
        D b2 = new D();

        System.out.println("C类的静态方法");
        C.f();
        System.out.println("D类的静态方法");
        D.f();
        System.out.println("----------");

        // 取决于类名
        System.out.println("f()为静态方法");
        System.out.print("C类C实例：");
        a1.f();
        System.out.print("C类D实例：");
        b1.f();
        System.out.print("D类D实例：");
        b2.f();

        System.out.println("----------");

        System.out.println("g()为final方法");
        a1.g();
        b1.g();
        b2.g();
        System.out.println("----------");
        // 编译看左边，执行看右边
        System.out.println("h()为普通继承方法");
        a1.h();
        b1.h();
        b2.h();


    }
}
