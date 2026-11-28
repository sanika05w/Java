import java.util.*;

public class StringReverseUsingStack
{
    public static void main(String[] args) {
        String s = "stack";
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) st.push(c);
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) sb.append(st.pop());
        System.out.println(sb);
    }
}
