public class LinkedListImplementation
{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        for (Node n = head; n != null; n = n.next) System.out.print(n.val + " -> ");
        System.out.println("null");
    }

    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }
}
