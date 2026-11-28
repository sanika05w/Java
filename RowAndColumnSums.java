public class RowAndColumnSums
{
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            int r = 0, c = 0;
            for (int j = 0; j < 3; j++) { r += m[i][j]; c += m[j][i]; }
            System.out.println("Row " + i + " = " + r + ", Col " + i + " = " + c);
        }
    }
}
