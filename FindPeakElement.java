public class FindPeakElement
{
    public static void main(String[] args) {
        int[] a = {1, 3, 20, 4, 1, 0};
        for (int i = 0; i < a.length; i++) {
            boolean l = i == 0 || a[i] >= a[i - 1];
            boolean r = i == a.length - 1 || a[i] >= a[i + 1];
            if (l && r) { System.out.println("Peak = " + a[i]); break; }
        }
    }
}
