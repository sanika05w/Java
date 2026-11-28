import java.util.Arrays;

public class JaggedArray
{
    public static void main(String[] args) {
        int[][] j = new int[3][];
        j[0] = new int[]{1};
        j[1] = new int[]{2, 3};
        j[2] = new int[]{4, 5, 6};
        for (int[] row : j) System.out.println(Arrays.toString(row));
    }
}
