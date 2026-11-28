public class StopwatchDemo
{
    public static void main(String[] args) {
        long start = System.nanoTime();
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) sum += i;
        long end = System.nanoTime();
        System.out.println("Sum = " + sum);
        System.out.println("Time taken (ms) = " + (end - start) / 1_000_000);
    }
}
