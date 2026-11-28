public class CompoundInterest
{
    public static void main(String[] args) {
        double p = 10000, r = 5, t = 3;
        double amount = p * Math.pow(1 + r / 100, t);
        System.out.printf("Compound Interest = %.2f%n", amount - p);
    }
}
