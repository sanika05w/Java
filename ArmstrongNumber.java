public class ArmstrongNumber
{
    public static void main(String[] args) {
        int n = 153, original = n, sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }
        System.out.println(original + (sum == original ? " is an Armstrong number" : " is not an Armstrong number"));
    }
}
