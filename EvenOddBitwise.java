public class EvenOddBitwise
{
    public static void main(String[] args) {
        int n = 37;
        System.out.println(n + ((n & 1) == 0 ? " is even" : " is odd"));
    }
}
