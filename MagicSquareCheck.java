public class MagicSquareCheck
{
    public static void main(String[] args) {
        int[][] m = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int target = 0;
        for (int x : m[0]) target += x;
        boolean ok = true;
        for (int i = 0; i < 3; i++) {
            int r = 0, c = 0;
            for (int j = 0; j < 3; j++) { r += m[i][j]; c += m[j][i]; }
            if (r != target || c != target) ok = false;
        }
        if (m[0][0] + m[1][1] + m[2][2] != target || m[0][2] + m[1][1] + m[2][0] != target) ok = false;
        System.out.println(ok ? "Magic square" : "Not a magic square");
    }
}
