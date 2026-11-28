public class StrongNumber
{
    public static void main(String[] args) {
        int n = 145, t = n, sum = 0;
        while (t != 0) {
            int d = t % 10;
            int f = 1;
            for (int i = 2; i <= d; i++) f *= i;
            sum += f;
            t /= 10;
        }
        System.out.println(n + (sum == n ? " is a strong number" : " is not a strong number"));
    }
}
