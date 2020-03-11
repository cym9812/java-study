package practice;
import java.util.*;
public class RandomNumber {
    public static void main(String[] args){
        int a;
        Random s = new Random();
        for (int i = 0; i<100000; i++){
            a = s.nextInt(7) + 2;
            System.out.println(a);
            if (a > 8 || a < 2){
                System.out.printf("error:%d", a);
                break;
            }
        }
    }
}
