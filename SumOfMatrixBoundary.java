public class SumOfMatrixBoundary
{
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (i == 0 || j == 0 || i == 2 || j == 2) sum += m[i][j];
        System.out.println("Boundary sum = " + sum);
    }
}
