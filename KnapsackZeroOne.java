public class KnapsackZeroOne
{
    public static void main(String[] args) {
        int[] w = {1, 3, 4, 5}, v = {1, 4, 5, 7};
        int cap = 7;
        int[] dp = new int[cap + 1];
        for (int i = 0; i < w.length; i++)
            for (int c = cap; c >= w[i]; c--) dp[c] = Math.max(dp[c], dp[c - w[i]] + v[i]);
        System.out.println("Max value = " + dp[cap]);
    }
}
