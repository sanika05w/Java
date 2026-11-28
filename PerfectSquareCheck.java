public class PerfectSquareCheck
{
    public static void main(String[] args) {
        int n = 144;
        int root = (int) Math.sqrt(n);
        System.out.println(n + (root * root == n ? " is a perfect square" : " is not a perfect square"));
    }
}
