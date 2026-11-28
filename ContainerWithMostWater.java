public class ContainerWithMostWater
{
    public static void main(String[] args) {
        int[] h = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int l = 0, r = h.length - 1, best = 0;
        while (l < r) {
            best = Math.max(best, Math.min(h[l], h[r]) * (r - l));
            if (h[l] < h[r]) l++; else r--;
        }
        System.out.println("Max area = " + best);
    }
}
