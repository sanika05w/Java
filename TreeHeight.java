public class TreeHeight
{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.l = new Node(2); root.r = new Node(3);
        root.l.l = new Node(4); root.l.l.l = new Node(5);
        System.out.println("Height = " + height(root));
    }

    static class Node { int val; Node l, r; Node(int v) { val = v; } }
    static int height(Node n) {
        return n == null ? 0 : 1 + Math.max(height(n.l), height(n.r));
    }
}
