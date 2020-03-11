package 基础语法;

import java.util.Arrays;

public class ParametersTest {
    private String[] a;

    public static void main(String[] args) {
        set_variable_parameter("Xiao Ming", "Xiao Hong", "Xiao Jun");
        set_String_array(new String[]{"Xiao Ming", "Xiao Hong", "Xiao Jun"});

        sum(1, 2);
        sum(1, 2, 3);

        // 引用类型形参影响实参
        // 基本类型形参不影响实参


    }

    public static void set_variable_parameter(String... var) {
        String[] a = var;
        System.out.println(Arrays.toString(a));
    }

    public static void set_String_array(String[] var) {
        String[] a = var;
        System.out.println(Arrays.toString(a));
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }
}