import java.util.*;

public class FloodFillGrid
{
    public static void main(String[] args) {
        int[][] g = {{1, 1, 0}, {1, 0, 0}, {1, 1, 1}};
        fill(g, 0, 0, 1, 7);
        for (int[] row : g) System.out.println(Arrays.toString(row));
    }

    static void fill(int[][] g, int r, int c, int from, int to) {
        if (r < 0 || c < 0 || r >= g.length || c >= g[0].length || g[r][c] != from) return;
        g[r][c] = to;
        fill(g, r + 1, c, from, to);
        fill(g, r - 1, c, from, to);
        fill(g, r, c + 1, from, to);
        fill(g, r, c - 1, from, to);
    }
}
