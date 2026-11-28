import java.util.Arrays;

public class ArrayOfSquares
{
    public static void main(String[] args) {
        int[] sq = new int[10];
        for (int i = 0; i < sq.length; i++) sq[i] = (i + 1) * (i + 1);
        System.out.println(Arrays.toString(sq));
    }
}
