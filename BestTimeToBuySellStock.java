public class BestTimeToBuySellStock
{
    public static void main(String[] args) {
        int[] p = {7, 1, 5, 3, 6, 4};
        int min = Integer.MAX_VALUE, best = 0;
        for (int x : p) {
            min = Math.min(min, x);
            best = Math.max(best, x - min);
        }
        System.out.println("Max profit = " + best);
    }
}
