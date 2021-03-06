package 基础语法;

public class TryFinallyExample {
    public static int testFinally() {
        try {
            System.out.println("start");
            int a = 1 / 0;
            return a;
        } catch (Exception e) {
            System.out.println("catch 执行");
            return 0;
        } finally {
            System.out.println("finally 最终执行");
        }
    }

    public static void main(String[] args) {
        System.out.println(testFinally());
    }
}


