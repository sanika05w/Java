public class SumOfSeries
{
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 10; i++) sum += 1.0 / i;
        System.out.println("1 + 1/2 + ... + 1/10 = " + sum);
    }
}
