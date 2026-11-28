import java.util.*;

public class EvenOddSeparate
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        List<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
        for (int x : a) (x % 2 == 0 ? even : odd).add(x);
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
