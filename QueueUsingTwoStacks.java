import java.util.*;

public class QueueUsingTwoStacks
{
    public static void main(String[] args) {
        Deque<Integer> in = new ArrayDeque<>(), out = new ArrayDeque<>();
        for (int i = 1; i <= 4; i++) in.push(i);
        while (!in.isEmpty()) out.push(in.pop());
        while (!out.isEmpty()) System.out.print(out.pop() + " ");
        System.out.println();
    }
}
