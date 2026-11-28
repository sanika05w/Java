public class LowerTriangularMatrix
{
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print((j <= i ? m[i][j] : 0) + " ");
            System.out.println();
        }
    }
}
