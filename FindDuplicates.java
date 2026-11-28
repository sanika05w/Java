public class FindDuplicates
{
    public static void main(String[] args) {
        int[] a = {4, 2, 7, 2, 9, 4};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) System.out.println("Duplicate: " + a[i]);
            }
        }
    }
}
