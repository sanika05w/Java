public class HollowTriangle
{
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print((j == 1 || j == i || i == n) ? "* " : "  ");
            System.out.println();
        }
    }
}
