public class CircularQueueDemo
{
    public static void main(String[] args) {
        CQueue q = new CQueue(3);
        q.add(1); q.add(2); q.add(3);
        System.out.println(q.add(4));
        System.out.println(q.remove());
        System.out.println(q.add(4));
    }

    static class CQueue {
        int[] d; int head = 0, size = 0;
        CQueue(int n) { d = new int[n]; }
        boolean add(int x) {
            if (size == d.length) return false;
            d[(head + size++) % d.length] = x;
            return true;
        }
        int remove() {
            int x = d[head];
            head = (head + 1) % d.length;
            size--;
            return x;
        }
    }
}
