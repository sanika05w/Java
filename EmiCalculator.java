public class EmiCalculator
{
    public static void main(String[] args) {
        double p = 500000, annualRate = 8.5, years = 5;
        double r = annualRate / 12 / 100;
        int n = (int) (years * 12);
        double emi = p * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1);
        System.out.printf("Monthly EMI = %.2f%n", emi);
    }
}
