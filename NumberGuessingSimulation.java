import java.util.*;

public class NumberGuessingSimulation
{
    public static void main(String[] args) {
        int secret = new Random(5).nextInt(100) + 1;
        int lo = 1, hi = 100, tries = 0;
        while (true) {
            int guess = (lo + hi) / 2;
            tries++;
            if (guess == secret) { System.out.println("Found " + secret + " in " + tries + " tries"); break; }
            if (guess < secret) lo = guess + 1;
            else hi = guess - 1;
        }
    }
}
