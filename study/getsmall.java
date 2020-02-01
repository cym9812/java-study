package study;

public class getsmall {
    public static void main(String[] args) {
        getSmallestN(12000);
    }
    public static void getSmallestN(int n){
        int result = 0;
        while (Math.pow(result, 2) <= n){
            result++;
        }
        System.out.printf("The smallest n such that n^2 > %d is %d", n, result);
    }
}
