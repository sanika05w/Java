import java.util.Arrays;

public class RemoveDuplicatesFromArray
{
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(Arrays.toString(Arrays.stream(a).distinct().toArray()));
    }
}
