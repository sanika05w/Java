public class SumOfNaturalNumbers
{
    public static void main(String[] args) {
        int n = 100, sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum of 1 to " + n + " = " + sum);
    }
}
