import java.util.*;

public class SwapRowsInMatrix
{
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] t = m[0]; m[0] = m[2]; m[2] = t;
        System.out.println(Arrays.deepToString(m));
    }
}
