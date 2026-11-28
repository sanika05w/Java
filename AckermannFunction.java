public class AckermannFunction
{
    public static void main(String[] args) {
        System.out.println("A(2, 3) = " + ack(2, 3));
    }

    static int ack(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return ack(m - 1, 1);
        return ack(m - 1, ack(m, n - 1));
    }
}
