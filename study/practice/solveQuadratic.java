package practice;

public class solveQuadratic {
    public static void main(String[] args){
        solve(1,2,3);
    }
    public static void solve(int a, int b, int c){
        double root_one;
        double root_two;
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            root_one = (- b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            root_two = (- b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.printf("The roots are %f and %f", root_one, root_two);
        }else if (discriminant == 0){
            root_one = (- b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.printf("The root is %f", root_one);
        }else {
            System.out.println("The equation has no real roots");
        }

    }
}
