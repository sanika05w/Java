public class DoublyLinkedListDemo
{
    public static void main(String[] args) {
        Node head = new Node(1), second = new Node(2), third = new Node(3);
        head.next = second; second.prev = head;
        second.next = third; third.prev = second;
        for (Node n = head; n != null; n = n.next) System.out.print(n.val + " ");
        System.out.println();
        for (Node n = third; n != null; n = n.prev) System.out.print(n.val + " ");
        System.out.println();
    }

    static class Node {
        int val; Node next, prev;
        Node(int v) { val = v; }
    }
}
