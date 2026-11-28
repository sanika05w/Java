import java.util.*;

public class RockPaperScissorsSeeded
{
    public static void main(String[] args) {
        String[] opts = {"Rock", "Paper", "Scissors"};
        Random r = new Random(7);
        for (int round = 1; round <= 3; round++) {
            int you = r.nextInt(3), pc = r.nextInt(3);
            String res = you == pc ? "Draw" : (you - pc + 3) % 3 == 1 ? "You win" : "Computer wins";
            System.out.println("Round " + round + ": " + opts[you] + " vs " + opts[pc] + " -> " + res);
        }
    }
}
