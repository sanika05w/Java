public class RodCutting
{
    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = 8;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= i; j++) dp[i] = Math.max(dp[i], price[j - 1] + dp[i - j]);
        System.out.println("Max revenue = " + dp[n]);
    }
}
