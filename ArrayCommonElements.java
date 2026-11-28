public class ArrayCommonElements
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}, b = {4, 5, 6, 7};
        for (int x : a) {
            for (int y : b) if (x == y) System.out.print(x + " ");
        }
        System.out.println();
    }
}
