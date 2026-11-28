import java.util.*;

public class CoinChangeMinCoins
{
    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25};
        int amount = 63;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++)
            for (int c : coins)
                if (c <= i && dp[i - c] != Integer.MAX_VALUE) dp[i] = Math.min(dp[i], dp[i - c] + 1);
        System.out.println("Min coins for " + amount + " = " + dp[amount]);
    }
}
