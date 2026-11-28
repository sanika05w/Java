public class CoinChangeWays
{
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int c : coins)
            for (int i = c; i <= amount; i++) dp[i] += dp[i - c];
        System.out.println("Ways = " + dp[amount]);
    }
}
