import java.util.*;

public class CountSetBits
{
    public static void main(String[] args) {
        int n = 29;
        int count = 0, t = n;
        while (t != 0) {
            count += t & 1;
            t >>= 1;
        }
        System.out.println("Set bits in " + n + " = " + count);
    }
}
