public class CountOfSmallerElements
{
    public static void main(String[] args) {
        int[] a = {5, 2, 6, 1};
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = i + 1; j < a.length; j++) if (a[j] < a[i]) c++;
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
