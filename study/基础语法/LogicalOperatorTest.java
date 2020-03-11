package 基础语法;

public class LogicalOperatorTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 30;

        // & = and
        System.out.println((i > j) & (i > k)); // false & false = false
        System.out.println((i < j) & (i > k)); // true & false = false
        System.out.println((i > j) & (i < k)); // false & true = false
        System.out.println((i < j) & (i < k)); // true & true = true
        System.out.println("-----------");

        // | = or
        System.out.println((i > j) | (i > k)); // false | false = false
        System.out.println((i < j) | (i > k)); // true | false = true
        System.out.println((i > j) | (i < k)); // false | true = true
        System.out.println((i < j) | (i < k)); // true | true = true
        System.out.println("-----------");

        // ^ = xor
        System.out.println((i > j) ^ (i > k)); // false ^ false = false
        System.out.println((i < j) ^ (i > k)); // true ^ false = true
        System.out.println((i > j) ^ (i < k)); // false ^ true = true
        System.out.println((i < j) ^ (i < k)); // true ^ true = false
        System.out.println("-----------");

        // ! = !
        System.out.println(!(i > j)); // !false
        System.out.println("-----------");

        int l = 10;
        int m = 20;
        int n = 30;

        // && 短路与
        System.out.println((l++ > 100) && (m++ > 100));
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("-----------");

        // || 短路或
        System.out.println((m++ < 100) || (n++ > 100));
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("-----------");
    }
}