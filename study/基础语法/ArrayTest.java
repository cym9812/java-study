package 基础语法;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // 栈内存：储存局部变量，使用完后立即消失
        // 堆内存：储存new出来的内容，数组初始化时，会为储存空间添加默认值，垃圾回收器回收。
        int[] a = new int[10];
        a[0] = 12;
        a[5] = 5;
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("----------");

        // 两种方法
        int[] b = new int[]{1, 2, 3, 4, 5};
        int[] c = {1, 2, 3, 4, 5};
        System.out.println(Arrays.equals(b, c));
        for (int i : b) {
            System.out.println(i);
        }
        System.out.println("----------");

        // 数组元素对比
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {1, 2, 3, 5, 6};
        System.out.println(compare(x, y));
        System.out.println("----------");

        // 查找元素
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("查找元素：3");
        // Scanner sc = new Scanner(System.in);
        // int val = sc.nextInt();
        // System.out.println(getIndex(arr, val));
        System.out.println(getIndex(arr, 3));
        System.out.println("----------");

        // 反转
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4};
        int[] arr4 = {1, 2, 3};
        int[] arr5 = {1, 2};
        int[] arr6 = {1};
        reverse(arr2);
        reverse(arr3);
        reverse(arr4);
        reverse(arr5);
        reverse(arr6);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));


    }

    public static boolean compare(int[] x, int[] y) {
        if (x.length != y.length) {
            return false;
        }

        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) {
                return false;
            }
        }

        //return Arrays.equals(x,y);
        return true;
    }

    public static int getIndex(int[] arr, int number){
        int index = -1;
        for (int i =0; i < arr.length; i++){
            if (arr[i] == number){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void reverse(int[] arr){
/*        int l = 0;
        int r = arr.length - 1;
        int temp;
        while (l < r){
            temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            l += 1;
            r -= 1;
        }*/

        for (int l = 0,r = arr.length - 1; l < r; l++, r-- ){
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
        }
    }
}
