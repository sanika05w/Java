public class SpiralNumberPattern
{
    public static void main(String[] args) {
        int n = 4;
        int[][] m = new int[n][n];
        int v = 1, top = 0, bot = n - 1, left = 0, right = n - 1;
        while (v <= n * n) {
            for (int i = left; i <= right; i++) m[top][i] = v++;
            top++;
            for (int i = top; i <= bot; i++) m[i][right] = v++;
            right--;
            for (int i = right; i >= left; i--) m[bot][i] = v++;
            bot--;
            for (int i = bot; i >= top; i--) m[i][left] = v++;
            left++;
        }
        for (int[] row : m) {
            for (int x : row) System.out.printf("%3d", x);
            System.out.println();
        }
    }
}
