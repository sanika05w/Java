import java.util.Arrays;

public class MatrixTranspose
{
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}};
        int[][] t = new int[3][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++) t[j][i] = m[i][j];
        System.out.println(Arrays.deepToString(t));
    }
}
