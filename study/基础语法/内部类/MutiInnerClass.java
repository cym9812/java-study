package 基础语法.内部类;

public class MutiInnerClass {
    static class One{
        private static class two{
            public static void main(String[] args) {
                System.out.println("two");
            }
        }
    }
}
