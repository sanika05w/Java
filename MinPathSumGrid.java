public class MinPathSumGrid
{
    public static void main(String[] args) {
        int[][] g = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int r = g.length, c = g[0].length;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                if (i == 0 && j == 0) continue;
                int up = i > 0 ? g[i - 1][j] : Integer.MAX_VALUE;
                int left = j > 0 ? g[i][j - 1] : Integer.MAX_VALUE;
                g[i][j] += Math.min(up, left);
            }
        System.out.println("Min path sum = " + g[r - 1][c - 1]);
    }
}
