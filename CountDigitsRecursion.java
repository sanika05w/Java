public class CountDigitsRecursion
{
    public static void main(String[] args) {
        System.out.println("Digits = " + count(987654));
    }

    static int count(int n) {
        return n < 10 ? 1 : 1 + count(n / 10);
    }
}
