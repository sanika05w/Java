public class LongestIncreasingSubarray
{
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 4, 7, 8, 9, 2};
        int best = 1, cur = 1;
        for (int i = 1; i < a.length; i++) {
            cur = a[i] > a[i - 1] ? cur + 1 : 1;
            best = Math.max(best, cur);
        }
        System.out.println("Longest increasing run = " + best);
    }
}
