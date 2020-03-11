package 基础语法.抽象类;

public class AnimalTest {
    public static void main(String[] args) {
        testEat(new Cat());
        testEat(new Dog());
        System.out.println(new Cat("cat", 20).toString());
    }

    public static void testEat(Animal a){
        a.eat();
    }
}
