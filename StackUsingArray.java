public class StackUsingArray
{
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10); s.push(20); s.push(30);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }

    static class MyStack {
        int[] data; int top = -1;
        MyStack(int size) { data = new int[size]; }
        void push(int x) { data[++top] = x; }
        int pop() { return data[top--]; }
        int peek() { return data[top]; }
    }
}
