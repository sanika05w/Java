public class DiagonalSum
{
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int main = 0, sec = 0;
        for (int i = 0; i < 3; i++) {
            main += m[i][i];
            sec += m[i][2 - i];
        }
        System.out.println("Main=" + main + " Secondary=" + sec);
    }
}
