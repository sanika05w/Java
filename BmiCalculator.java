public class BmiCalculator
{
    public static void main(String[] args) {
        double weight = 68, height = 1.72;
        double bmi = weight / (height * height);
        System.out.printf("BMI = %.2f%n", bmi);
        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else System.out.println("Overweight");
    }
}
