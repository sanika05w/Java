public class RunningMaximum
{
    public static void main(String[] args) {
        int[] a = {3, 1, 4, 1, 5, 9, 2, 6};
        int max = a[0];
        for (int x : a) {
            max = Math.max(max, x);
            System.out.print(max + " ");
        }
        System.out.println();
    }
}
