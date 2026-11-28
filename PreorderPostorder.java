public class PreorderPostorder
{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.l = new Node(2); root.r = new Node(3);
        root.l.l = new Node(4); root.l.r = new Node(5);
        pre(root); System.out.println();
        post(root); System.out.println();
    }

    static class Node { int val; Node l, r; Node(int v) { val = v; } }
    static void pre(Node n) { if (n == null) return; System.out.print(n.val + " "); pre(n.l); pre(n.r); }
    static void post(Node n) { if (n == null) return; post(n.l); post(n.r); System.out.print(n.val + " "); }
}
