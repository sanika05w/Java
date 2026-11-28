public class MatrixScalarMultiply
{
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}};
        int k = 3;
        for (int[] row : m) {
            for (int x : row) System.out.print(x * k + " ");
            System.out.println();
        }
    }
}
