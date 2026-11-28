public class DiagonalTraversal
{
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = 3;
        for (int s = 0; s <= 2 * (n - 1); s++) {
            for (int i = 0; i < n; i++) {
                int j = s - i;
                if (j >= 0 && j < n) System.out.print(m[i][j] + " ");
            }
        }
        System.out.println();
    }
}
