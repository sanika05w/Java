public class SparseMatrixCheck
{
    public static void main(String[] args) {
        int[][] m = {{1, 0, 0}, {0, 0, 2}, {0, 0, 0}};
        int zeros = 0;
        for (int[] row : m) for (int x : row) if (x == 0) zeros++;
        System.out.println(zeros > (m.length * m[0].length) / 2 ? "Sparse matrix" : "Not sparse");
    }
}
