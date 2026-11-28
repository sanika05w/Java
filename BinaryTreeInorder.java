public class BinaryTreeInorder
{
    public static void main(String[] args) {
        Tree root = new Tree(4);
        root.left = new Tree(2);
        root.right = new Tree(6);
        root.left.left = new Tree(1);
        root.left.right = new Tree(3);
        inorder(root);
        System.out.println();
    }

    static class Tree {
        int val; Tree left, right;
        Tree(int val) { this.val = val; }
    }
    static void inorder(Tree t) {
        if (t == null) return;
        inorder(t.left);
        System.out.print(t.val + " ");
        inorder(t.right);
    }
}
