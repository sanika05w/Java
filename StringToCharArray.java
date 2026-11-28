import java.util.*;

public class StringToCharArray
{
    public static void main(String[] args) {
        String s = "code";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));
    }
}
