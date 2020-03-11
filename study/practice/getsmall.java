package practice;

public class getsmall {
    public static void main(String[] args) {
        System.out.printf("The smallest n such that n^2 > %d is %d", 20000, getSmallestN(20000));
    }
    public static int getSmallestN(int n){
        int result = 0;
        while (Math.pow(result, 2) <= n){
            result++;
        }
        return result;
    }
}
