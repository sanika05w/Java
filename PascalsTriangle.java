public class PascalsTriangle
{
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            int c = 1;
            System.out.print(" ".repeat((n - i) * 2));
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", c);
                c = c * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
