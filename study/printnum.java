package study;

public class printnum {
    public static void main(String[] args) {
        printNumbers(10, 200);
    }
    public static void printNumbers(int startNum, int endNum){
        int i;
        for (i = startNum; i <= endNum; i++){
            if (i % 5 == 0 && i % 6 == 0){
                System.out.printf("%d ", i);
            }
        }
    }

}
