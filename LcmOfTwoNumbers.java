public class LcmOfTwoNumbers
{
    public static void main(String[] args) {
        int a = 12, b = 18;
        int x = a, y = b;
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        System.out.println("LCM = " + (a * b / x));
    }
}
