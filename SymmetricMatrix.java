public class SymmetricMatrix
{
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        boolean sym = true;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (m[i][j] != m[j][i]) sym = false;
        System.out.println(sym ? "Symmetric" : "Not symmetric");
    }
}
