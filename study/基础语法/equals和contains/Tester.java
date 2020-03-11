package 基础语法.equals和contains;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List list = new ArrayList();
        Test test1 = new Test("object");
        Test test2 = new Test("object");
        Test test3 = new Test("objec");
        Object test4 = new Test("object");
        list.add(test1);

        System.out.println("test1 == test2: " + test1.equals(test2));
        System.out.println("test1 == test3: " + test1.equals(test3));
        System.out.println("test2 == test4: " + test2.equals(test4));
        System.out.println("------------");

        /*ArrayList的contains()方法
         * indexOf() -> indexOfRange() -> equals()
         * 而equals函数被在Test类中被重写
         * */
        System.out.println(list.contains(test1));
        System.out.println(list.contains(test2));
        System.out.println(list.contains(test3));


    }

}
