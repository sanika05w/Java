public class ArrayCumulativeProduct
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int p = 1;
        for (int x : a) {
            p *= x;
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
