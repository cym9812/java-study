package practice;

public class maxnumber {
    public static void main(String[] args) {
        computeAndInterpretBMI(140, 5, 10);
    }

    public static void computeAndInterpretBMI(double pounds, double feet, double inches) {
        double bmi = pounds * 0.45359237 / ((0.0254 * inches) * (0.0254 * inches));
        if (bmi > 0 && bmi < 18.5) {
            System.out.printf("BMI is %.2f, Underweight", bmi);
        } else if (bmi > 18.5 && bmi < 25.0) {
            System.out.printf("BMI is %.2f, Normal", bmi);
        } else if (bmi > 25.0 && bmi < 30.0) {
            System.out.printf("BMI is %.2f, Wverweight", bmi);
        } else if (bmi >= 30.0) {
            System.out.printf("BMI is %.2f, Obese", bmi);
        }

    }
}
