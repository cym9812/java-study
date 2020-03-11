package 基础语法.继承测试;

public class Test {
    public static void main(String[] args) {
        //构造函数的调用
        Son a = new Son();
        System.out.println("---------");
        Father b = new Son();
        System.out.println("---------");

        // 多态
        Son d = new Son();
        Father e = new Son();
        System.out.println("---------");
        //成员变量：编译看左边，执行看左边
        System.out.println(d.PublicString);
        System.out.println(e.PublicString);
        System.out.println("---------");
        //成员方法：编译看左边(在父类中找有没有这个方法)，执行看右边(实际执行子类的方法)
        d.sonPublic();
        //e.sonPublic();
        System.out.println("---------");
        d.fatherPublic();
        e.fatherPublic();

        //多态转型，向上转型，向下转型
        Father f = new Son();
        Son g = (Son) f;
        g.fatherPublic();
        g.sonPublic();

    }
}
