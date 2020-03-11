package 基础语法.内部类;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        InnerInter i = new InnerInter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();

    }
}
