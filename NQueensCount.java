public class NQueensCount
{
    public static void main(String[] args) {
        System.out.println("Solutions for 6 queens = " + solve(0, 6, new int[6]));
    }

    static int solve(int row, int n, int[] cols) {
        if (row == n) return 1;
        int count = 0;
        for (int c = 0; c < n; c++) {
            boolean ok = true;
            for (int r = 0; r < row; r++)
                if (cols[r] == c || Math.abs(cols[r] - c) == row - r) { ok = false; break; }
            if (ok) { cols[row] = c; count += solve(row + 1, n, cols); }
        }
        return count;
    }
}
