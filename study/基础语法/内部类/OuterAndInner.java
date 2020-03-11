package 基础语法.内部类;

public class OuterAndInner {
    public void method(){
        class Inner1{
            public void show(){
                System.out.println("局部内部类");
            }
        }

        Inner1 i = new Inner1();
        i.show();
    }

    public class Inner2{
        public void show(){
            System.out.println("成员内部类");
        }
    }
}
