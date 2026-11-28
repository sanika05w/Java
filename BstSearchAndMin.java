public class BstSearchAndMin
{
    public static void main(String[] args) {
        Node root = null;
        for (int x : new int[]{50, 30, 70, 20, 40, 60, 80}) root = insert(root, x);
        System.out.println("Contains 60? " + search(root, 60));
        System.out.println("Contains 65? " + search(root, 65));
        Node m = root;
        while (m.l != null) m = m.l;
        System.out.println("Minimum = " + m.val);
    }

    static class Node { int val; Node l, r; Node(int v) { val = v; } }
    static Node insert(Node n, int v) {
        if (n == null) return new Node(v);
        if (v < n.val) n.l = insert(n.l, v); else n.r = insert(n.r, v);
        return n;
    }
    static boolean search(Node n, int v) {
        if (n == null) return false;
        return n.val == v || (v < n.val ? search(n.l, v) : search(n.r, v));
    }
}
