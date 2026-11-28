public class HarshadNumber
{
    public static void main(String[] args) {
        int n = 18, t = n, sum = 0;
        while (t != 0) {
            sum += t % 10;
            t /= 10;
        }
        System.out.println(n + (n % sum == 0 ? " is a Harshad number" : " is not a Harshad number"));
    }
}
