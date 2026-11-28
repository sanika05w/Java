import java.util.*;

public class FillArrayWithRandom
{
    public static void main(String[] args) {
        Random r = new Random(1);
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) a[i] = r.nextInt(50);
        System.out.println(Arrays.toString(a));
    }
}
