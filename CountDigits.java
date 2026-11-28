public class CountDigits
{
    public static void main(String[] args) {
        int n = 987654, count = 0;
        int t = n;
        while (t != 0) {
            t /= 10;
            count++;
        }
        System.out.println("Digits in " + n + " = " + count);
    }
}
