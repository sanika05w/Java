public class MaxConsecutiveOnes
{
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 1, 1, 1, 0, 1};
        int best = 0, cur = 0;
        for (int x : a) {
            cur = x == 1 ? cur + 1 : 0;
            best = Math.max(best, cur);
        }
        System.out.println("Max consecutive ones = " + best);
    }
}
