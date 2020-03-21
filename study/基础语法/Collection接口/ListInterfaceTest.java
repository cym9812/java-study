package 基础语法.Collection接口;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {
        // List有索引
        List<String> l = new ArrayList<String>();
        l.add("hello");
        l.add("world");
        l.add("java");

        System.out.println(l);

        System.out.println(l.isEmpty());

        System.out.println(l.size());

        System.out.println(l.contains("hello"));
        System.out.println(l.contains(""));
        System.out.println("---------");

/*        l.clear();
        System.out.println(l);*/
        // add
        l.add("abc");
        l.add(1, "def"); // 与Collection区别
        System.out.println(l);

        //remove
        l.remove("abc");
        l.remove(1); // 与Collection区别

        //set
        System.out.println(l.set(1, "change"));
        System.out.println(l);

        //get
        System.out.println(l.get(1));


    }
}
