public class PowerRecursion
{
    public static void main(String[] args) {
        System.out.println("2^8 = " + power(2, 8));
    }

    static long power(int b, int e) {
        return e == 0 ? 1 : b * power(b, e - 1);
    }
}
