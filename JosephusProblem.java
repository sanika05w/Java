public class JosephusProblem
{
    public static void main(String[] args) {
        System.out.println("Survivor = " + josephus(7, 3));
    }

    static int josephus(int n, int k) {
        return n == 1 ? 1 : (josephus(n - 1, k) + k - 1) % n + 1;
    }
}
