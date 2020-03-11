package 基础语法;

public class PrintFormatTest {

    public static void main(String[] args) {
        int num1 = 345;
        int num2 = -6;
        System.out.println("123456789012345678901234567890");
        System.out.printf("%d...%d...%n", num1, num2);
        System.out.printf("%10d...%7d...%n", num1, num2);
        System.out.printf("%-10d...%-7d...%n", num1, num2);
        System.out.printf("%+10d...%+7d...%n", num1, num2);
        System.out.println();
        double numd1 = 345.48;
        double numd2 = -0.12345678;
        System.out.println("123456789012345678901234567890");
        System.out.printf("%f...%f...%n", numd1, numd2);
        System.out.printf("%15f...%11f...%n", numd1, numd2);
        System.out.printf("%.2f...%.3f...%n", numd1, numd2);
        System.out.printf("%-15.1f...%-11.2f...%n", numd1, numd2);
        System.out.println("123456789012345678901234567890");
        System.out.println();
        double x = 27.5, y = 33.75;
        System.out.printf("x=%15.4f y=%8.4f%n", x, y);
    }
}
