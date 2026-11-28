public class ArraySecondSmallest
{
    public static void main(String[] args) {
        int[] a = {12, 13, 1, 10, 34, 1};
        int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
        for (int x : a) {
            if (x < s1) { s2 = s1; s1 = x; }
            else if (x < s2 && x != s1) s2 = x;
        }
        System.out.println("Second smallest = " + s2);
    }
}
