package 基础语法.继承测试;

public class TestAB {
    public static void main(String[] args) {
        A a1 = new A();
        A b1 = new B();
        B b2 = new B();
        a1.m1(); // A-m1
        a1.m2(); // A-m2
        b2.m2(); // B-m2
        b2.m3(); // B-m3
        b1.m1(); // A-m1
        b1.m2(); // B-m2
        //b1 不可直接调用m3
        ((B) b1).m3(); //B-m3

    }
}
