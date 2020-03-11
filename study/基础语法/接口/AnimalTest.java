package 基础语法.接口;

public class AnimalTest {
    public static void main(String[] args) {

        // 编译看左边，执行看右边
        Jump j = new Cat();
        j.jump();
        // j.eat();

        jumpTest(new Cat());

        // Animal类存在Jump接口
        Animal a = new Dog();
        a.eat();
        a.jump();

    }

    public static void jumpTest(Jump j){
        j.jump();
    }
}
