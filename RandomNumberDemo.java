import java.util.*;

public class RandomNumberDemo
{
    public static void main(String[] args) {
        Random r = new Random(42);
        for (int i = 0; i < 5; i++) {
            System.out.print(r.nextInt(100) + " ");
        }
        System.out.println();
    }
}
