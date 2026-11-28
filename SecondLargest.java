public class SecondLargest
{
    public static void main(String[] args) {
        int[] a = {12, 45, 7, 89, 23};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : a) {
            if (x > first) { second = first; first = x; }
            else if (x > second && x != first) second = x;
        }
        System.out.println("Second largest = " + second);
    }
}
