package 算法练习;

import java.util.Arrays;

public class BubbleSort extends SortAlgorithm{

    public BubbleSort(int[] arr) {
        super(arr);
    }

    @Override
    public void sortArr() {
        int unSort = this.arr.length - 1;
        boolean sortFinish = false; //没有完成排序
        while (!sortFinish){
            sortFinish = true;
            for (int i = 0; i < unSort; i++){ //只检查检查unSort部分
                if (this.arr[i] > this.arr[i+1]){
                    sortFinish = false;
                    int temp = this.arr[i+1];
                    this.arr[i+1] = this.arr[i];
                    this.arr[i] = temp;
                }
            }
            unSort--; //每次必定完成一个元素的排序
            // showResult();
        }
    }

    @Override
    public void sortArrShowStep() {

    }
}
