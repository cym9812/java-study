package 算法练习;

import java.util.Arrays;

public abstract class SortAlgorithm {
    protected int[] arr;

    public SortAlgorithm(int[] arr) {
        this.arr = arr;
    }

    public abstract void sortArr();

    public abstract void sortArrShowStep();

    public void time(){
        long startTime=System.nanoTime();
        System.out.println("执行代码块/方法");
        sortArr();
        long endTime=System.nanoTime();
        System.out.println(this.getClass().getName().substring(5)+"运行时间： "+(endTime-startTime)+"ns");
    }

    public void showResult(){
        System.out.println(Arrays.toString(arr));
    }
}
