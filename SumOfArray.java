public class SumOfArray
{
    public static void main(String[] args) {
        int[] a = {4, 8, 15, 16, 23, 42};
        int sum = 0;
        for (int x : a) sum += x;
        System.out.println("Sum = " + sum);
    }
}
