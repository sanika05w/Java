public class QueueUsingArray
{
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        q.enqueue(1); q.enqueue(2); q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }

    static class MyQueue {
        int[] data; int front = 0, rear = 0;
        MyQueue(int size) { data = new int[size]; }
        void enqueue(int x) { data[rear++] = x; }
        int dequeue() { return data[front++]; }
    }
}
