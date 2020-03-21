package 基础语法.Collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceTest {
    public static void main(String[] args) {
        //Collection无索引
        Collection<String> c = new ArrayList<>();

        c.add("hello");
        c.add("world");
        c.add("java");
        // c.add(1, "abc"); 与List区别

        c.add("test");
        c.remove("test");
        // c.remove(1); 与List区别

        // 无set()方法


        System.out.println(c);

        System.out.println(c.isEmpty());

        System.out.println(c.size());

        System.out.println(c.contains("hello"));
        System.out.println(c.contains(""));

        // Collection 只能使用迭代器或foreach访问
        Iterator<String> it = c.iterator();
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());    NoSuchElementException
        while (it.hasNext()){
            System.out.println(it.next());
        }

        c.clear();

        System.out.println(c);


    }

}
