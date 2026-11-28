import java.util.*;

public class LevelOrderTraversal
{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.l = new Node(2); root.r = new Node(3);
        root.l.l = new Node(4); root.l.r = new Node(5);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            System.out.print(n.val + " ");
            if (n.l != null) q.add(n.l);
            if (n.r != null) q.add(n.r);
        }
        System.out.println();
    }

    static class Node { int val; Node l, r; Node(int v) { val = v; } }
}
