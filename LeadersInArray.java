public class LeadersInArray
{
    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        int max = Integer.MIN_VALUE;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > max) { max = a[i]; System.out.print(a[i] + " "); }
        }
        System.out.println();
    }
}
