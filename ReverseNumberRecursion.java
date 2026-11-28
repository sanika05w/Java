public class ReverseNumberRecursion
{
    public static void main(String[] args) {
        System.out.println(rev(12345, 0));
    }

    static int rev(int n, int acc) {
        return n == 0 ? acc : rev(n / 10, acc * 10 + n % 10);
    }
}
