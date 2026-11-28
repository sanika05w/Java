import java.util.*;

public class LargestNumberFromDigits
{
    public static void main(String[] args) {
        int[] d = {3, 9, 1, 7, 5};
        Arrays.sort(d);
        StringBuilder sb = new StringBuilder();
        for (int i = d.length - 1; i >= 0; i--) sb.append(d[i]);
        System.out.println("Largest number = " + sb);
    }
}
