package 基础语法;

public class BoxingTest {
    public static void main(String[] args) {
        String a = "123";
        int b = 1;
        Integer d = new Integer(b);
        String c = a + b;
        System.out.println(d.toString());
    }
}
