import java.util.Arrays;

public class RotateMatrix90
{
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = 3;
        int[][] r = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) r[j][n - 1 - i] = m[i][j];
        System.out.println(Arrays.deepToString(r));
    }
}
