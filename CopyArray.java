import java.util.Arrays;

public class CopyArray
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, a.length);
        b[0] = 99;
        System.out.println(Arrays.toString(a) + " " + Arrays.toString(b));
    }
}
