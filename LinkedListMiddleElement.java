public class LinkedListMiddleElement
{
    public static void main(String[] args) {
        Node head = new Node(1);
        Node cur = head;
        for (int i = 2; i <= 7; i++) { cur.next = new Node(i); cur = cur.next; }
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; }
        System.out.println("Middle = " + slow.val);
    }

    static class Node { int val; Node next; Node(int v) { val = v; } }
}
