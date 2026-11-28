public class PalindromeTrianglePattern
{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat((n - i) * 2));
            for (int j = i; j >= 1; j--) System.out.print(j + " ");
            for (int j = 2; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}
