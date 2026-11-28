public class SpyNumber
{
    public static void main(String[] args) {
        int n = 1124, sum = 0, prod = 1;
        for (int t = n; t > 0; t /= 10) { sum += t % 10; prod *= t % 10; }
        System.out.println(n + (sum == prod ? " is a spy number" : " is not a spy number"));
    }
}
