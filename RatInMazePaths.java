public class RatInMazePaths
{
    public static void main(String[] args) {
        int[][] maze = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        System.out.println("Paths = " + paths(maze, 0, 0));
    }

    static int paths(int[][] m, int r, int c) {
        int n = m.length;
        if (r >= n || c >= n || m[r][c] == 0) return 0;
        if (r == n - 1 && c == n - 1) return 1;
        return paths(m, r + 1, c) + paths(m, r, c + 1);
    }
}
