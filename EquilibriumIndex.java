public class EquilibriumIndex
{
    public static void main(String[] args) {
        int[] a = {-7, 1, 5, 2, -4, 3, 0};
        int total = 0;
        for (int x : a) total += x;
        int left = 0;
        for (int i = 0; i < a.length; i++) {
            total -= a[i];
            if (left == total) { System.out.println("Equilibrium index = " + i); return; }
            left += a[i];
        }
        System.out.println("None");
    }
}
