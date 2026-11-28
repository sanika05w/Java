import java.util.*;

public class ListToArrayConversion
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 15);
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }
}
