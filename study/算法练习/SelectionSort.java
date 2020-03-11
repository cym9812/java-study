package 算法练习;

import java.util.Arrays;

public class SelectionSort extends SortAlgorithm{
    public SelectionSort(int[] arr) {
        super(arr);
    }

    @Override
    public void sortArr() {
        for (int i = 0; i < this.arr.length; i++){
            int low = i;
            for (int j = i; j < this.arr.length;j++){
                if (this.arr[low] > this.arr[j]){
                    low = j;
                }
            }
            int temp = this.arr[low];
            this.arr[low] = this.arr[i];
            this.arr[i] = temp;
            // showResult();
        }
    }

    @Override
    public void sortArrShowStep() {

    }
}
