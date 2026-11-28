public class UglyNumber
{
    public static void main(String[] args) {
        int n = 30, t = n;
        for (int f : new int[]{2, 3, 5}) while (t % f == 0) t /= f;
        System.out.println(n + (t == 1 ? " is an ugly number" : " is not an ugly number"));
    }
}
