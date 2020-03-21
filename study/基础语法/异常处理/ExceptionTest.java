package 基础语法.异常处理;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");

    }
    public static void method(){
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
