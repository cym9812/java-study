package 基础语法.Collection接口;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {

        // 创建
        ArrayList<String> arrlist = new ArrayList<String>();

        //添加
        arrlist.add("abc");
        arrlist.add("efg");
        arrlist.add("hij");
        arrlist.add(1, "ABC");
        System.out.println("array:" + arrlist);
        System.out.println("size:" + arrlist.size());
        System.out.println("---------");

        // 直接删除，返回True/False
//        System.out.println(arrlist.remove("abc"));
//        System.out.println(arrlist.remove("acb"));
//        System.out.println("array:"+arrlist);
//        System.out.println("---------");

        // 索引删除，返回被删除的元素
        System.out.println(arrlist.remove(1));
        System.out.println("array:" + arrlist);
        System.out.println("---------");

        // 更改，返回被更改的元素
        System.out.println(arrlist.set(1, "AAA"));
        System.out.println("array:" + arrlist);
        System.out.println("---------");

        // 查看
        System.out.println(arrlist.get(1));
        System.out.println("---------");

        // 遍历
        arrListTraverse(arrlist);
    }

    public static void arrListTraverse(ArrayList<String> arrList) {
        long startTime;
        long endTime;
        long duration;
        //foreach 慢

        startTime = System.nanoTime();
        for (String i : arrList) {
            System.out.println(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("foreach:" + duration);
        System.out.println("---------");
        //index 快
        startTime = System.nanoTime();
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("for:" + duration);
        System.out.println("---------");
        //迭代器
        startTime = System.nanoTime();
        Iterator<String> it = arrList.iterator();
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());    NoSuchElementException
        while (it.hasNext()){
            System.out.println(it.next());
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Iterator:" + duration);
    }

}
