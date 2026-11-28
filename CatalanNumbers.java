import java.util.*;

public class CatalanNumbers
{
    public static void main(String[] args) {
        int n = 10;
        long[] c = new long[n + 1];
        c[0] = 1;
        for (int i = 1; i <= n; i++)
            for (int j = 0; j < i; j++) c[i] += c[j] * c[i - 1 - j];
        System.out.println(Arrays.toString(c));
    }
}
