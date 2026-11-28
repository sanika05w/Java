import java.util.*;

public class RotateMatrixAntiClockwise
{
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = 3;
        int[][] r = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) r[n - 1 - j][i] = m[i][j];
        System.out.println(Arrays.deepToString(r));
    }
}
