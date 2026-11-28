public class FibonacciSeries
{
    public static void main(String[] args) {
        int a = 0, b = 1;
        for (int i = 0; i < 15; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
