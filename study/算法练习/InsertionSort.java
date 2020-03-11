package 算法练习;

public class InsertionSort extends SortAlgorithm {
    public InsertionSort(int[] arr) {
        super(arr);
    }

    @Override
    public void sortArr() {
        for (int i = 1;i<this.arr.length;i++){
            int item_to_insert = this.arr[i];
            int index = i - 1;
            while (index >= 0 && item_to_insert < this.arr[index]){
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = item_to_insert;
        }
    }

    @Override
    public void sortArrShowStep() {

    }
}
