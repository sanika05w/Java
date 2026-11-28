public class BinarySearchTreeInsert
{
    public static void main(String[] args) {
        Node root = null;
        for (int x : new int[]{50, 30, 70, 20, 40, 60, 80}) root = insert(root, x);
        inorder(root);
        System.out.println();
    }

    static class Node { int val; Node l, r; Node(int v) { val = v; } }
    static Node insert(Node n, int v) {
        if (n == null) return new Node(v);
        if (v < n.val) n.l = insert(n.l, v); else n.r = insert(n.r, v);
        return n;
    }
    static void inorder(Node n) {
        if (n == null) return;
        inorder(n.l);
        System.out.print(n.val + " ");
        inorder(n.r);
    }
}
