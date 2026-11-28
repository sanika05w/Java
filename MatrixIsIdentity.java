public class MatrixIsIdentity
{
    public static void main(String[] args) {
        int[][] m = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        boolean id = true;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (m[i][j] != (i == j ? 1 : 0)) id = false;
        System.out.println(id ? "Identity matrix" : "Not an identity matrix");
    }
}
