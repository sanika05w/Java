public class HappyNumber
{
    public static void main(String[] args) {
        int n = 19, seen = n;
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) { sum += (n % 10) * (n % 10); n /= 10; }
            n = sum;
        }
        System.out.println(seen + (n == 1 ? " is a happy number" : " is not a happy number"));
    }
}
