public class LargestInMatrix
{
    public static void main(String[] args) {
        int[][] m = {{3, 8, 1}, {9, 2, 7}, {4, 6, 5}};
        int max = m[0][0];
        for (int[] row : m) for (int x : row) max = Math.max(max, x);
        System.out.println("Largest = " + max);
    }
}
