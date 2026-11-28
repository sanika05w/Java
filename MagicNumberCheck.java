public class MagicNumberCheck
{
    public static void main(String[] args) {
        int n = 1234, t = n;
        while (t > 9) {
            int s = 0;
            while (t > 0) { s += t % 10; t /= 10; }
            t = s;
        }
        System.out.println(n + (t == 1 ? " is a magic number" : " is not a magic number"));
    }
}
