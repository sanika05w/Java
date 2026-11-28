public class HollowDiamond
{
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i) + "*");
            if (i > 1) System.out.print(" ".repeat(2 * i - 3) + "*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            System.out.print(" ".repeat(n - i) + "*");
            if (i > 1) System.out.print(" ".repeat(2 * i - 3) + "*");
            System.out.println();
        }
    }
}
