public class DetectLoopFloyd
{
    public static void main(String[] args) {
        Node a = new Node(1), b = new Node(2), c = new Node(3), d = new Node(4);
        a.next = b; b.next = c; c.next = d; d.next = b;
        Node slow = a, fast = a;
        boolean loop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { loop = true; break; }
        }
        System.out.println(loop ? "Loop detected" : "No loop");
    }

    static class Node { int val; Node next; Node(int v) { val = v; } }
}
