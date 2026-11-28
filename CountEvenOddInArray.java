public class CountEvenOddInArray
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int even = 0, odd = 0;
        for (int x : a) { if (x % 2 == 0) even++; else odd++; }
        System.out.println("Even=" + even + " Odd=" + odd);
    }
}
