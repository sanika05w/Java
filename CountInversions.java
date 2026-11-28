public class CountInversions
{
    public static void main(String[] args) {
        int[] a = {8, 4, 2, 1};
        int count = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] > a[j]) count++;
        System.out.println("Inversions = " + count);
    }
}
