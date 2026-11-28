public class PairsWithGivenDifference
{
    public static void main(String[] args) {
        int[] a = {5, 20, 3, 2, 50, 80};
        int diff = 78;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                if (a[i] - a[j] == diff) System.out.println(a[i] + " - " + a[j] + " = " + diff);
    }
}
