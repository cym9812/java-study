package 算法练习;

import java.util.Arrays;

public class testSort {
    public static void main(String[] args) {
        int[] a = {5,2,7,1,9,3,10,3,11,6,7,3,42,5,325,246,43,2,345,23,4,6,24,51,34,6,43,63,27,1,5,2,7,125,31,6};
        int[] b = {};
        int[] c = {1};
        SortAlgorithm ss = new SelectionSort(new int[] {5,2,7,1,9,3,10,3,11,6,7,3,42,5,325,246,43,2,345,23,4,6,24,51,34,6,43,63,27,1,5,2,7,125,31,6});
        ss.time();
        SortAlgorithm bs = new BubbleSort(new int[] {5,2,7,1,9,3,10,3,11,6,7,3,42,5,325,246,43,2,345,23,4,6,24,51,34,6,43,63,27,1,5,2,7,125,31,6});
        bs.time();
        SortAlgorithm is = new InsertionSort(new int[] {5,2,7,1,9,3,10,3,11,6,7,3,42,5,325,246,43,2,345,23,4,6,24,51,34,6,43,63,27,1,5,2,7,125,31,6});
        is.time();
        is.showResult();
    }
}
