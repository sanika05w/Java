public class MatrixTrace
{
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int t = 0;
        for (int i = 0; i < m.length; i++) t += m[i][i];
        System.out.println("Trace = " + t);
    }
}
