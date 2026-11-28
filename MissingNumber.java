public class MissingNumber
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6};
        int n = 6, expected = n * (n + 1) / 2, sum = 0;
        for (int x : a) sum += x;
        System.out.println("Missing = " + (expected - sum));
    }
}
