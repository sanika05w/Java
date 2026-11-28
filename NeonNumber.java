public class NeonNumber
{
    public static void main(String[] args) {
        int n = 9;
        int sq = n * n, sum = 0;
        while (sq != 0) {
            sum += sq % 10;
            sq /= 10;
        }
        System.out.println(n + (sum == n ? " is a neon number" : " is not a neon number"));
    }
}
