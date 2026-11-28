import java.util.*;

public class MatrixMaxPerRow
{
    public static void main(String[] args) {
        int[][] m = {{3, 8, 1}, {9, 2, 7}, {4, 6, 5}};
        for (int[] row : m) System.out.println(Arrays.stream(row).max().getAsInt());
    }
}
