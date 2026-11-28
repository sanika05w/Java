import java.util.*;

public class GameOfLifeOneStep
{
    public static void main(String[] args) {
        int[][] g = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int n = 3;
        int[][] next = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int c = 0;
                for (int di = -1; di <= 1; di++)
                    for (int dj = -1; dj <= 1; dj++) {
                        if (di == 0 && dj == 0) continue;
                        int x = i + di, y = j + dj;
                        if (x >= 0 && x < n && y >= 0 && y < n) c += g[x][y];
                    }
                next[i][j] = (g[i][j] == 1 && (c == 2 || c == 3)) || (g[i][j] == 0 && c == 3) ? 1 : 0;
            }
        }
        for (int[] row : next) System.out.println(Arrays.toString(row));
    }
}
