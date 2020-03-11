package 基础语法.接口;

public interface Inter {
    // 接口中默认修饰符
    public static final int a = 10;
    int b = 10;

    // 没有构造方法
    // public Inter(){}

    // 不能带方法体
    // public void method(){}

    // 方法默认修饰符
    public abstract void method1();
    void method2();

}
