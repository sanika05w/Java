public class ReverseLinkedList
{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Node prev = null, cur = head;
        while (cur != null) {
            Node nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        for (Node n = prev; n != null; n = n.next) System.out.print(n.val + " ");
        System.out.println();
    }

    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }
}
