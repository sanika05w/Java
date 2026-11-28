public class FindMinMaxIndex
{
    public static void main(String[] args) {
        int[] a = {14, 3, 27, 9, 18};
        int minI = 0, maxI = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minI]) minI = i;
            if (a[i] > a[maxI]) maxI = i;
        }
        System.out.println("Min at " + minI + ", Max at " + maxI);
    }
}
