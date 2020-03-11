package 基础语法.内部类;

public class InnerClassTest {
    public static void main(String[] args) {
        OuterAndInner o = new OuterAndInner();
        o.method();

        OuterAndInner.Inner2 i = new OuterAndInner().new Inner2();
        i.show();
    }
}
