import java.util.*;

public class CountDistinctElements
{
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 3, 4};
        System.out.println("Distinct = " + Arrays.stream(a).distinct().count());
    }
}
