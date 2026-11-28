import java.util.*;

public class TryWithResources
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner("10 20 30")) {
            int sum = 0;
            while (sc.hasNextInt()) sum += sc.nextInt();
            System.out.println("Sum = " + sum);
        }
    }
}
