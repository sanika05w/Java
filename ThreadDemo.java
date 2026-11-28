public class ThreadDemo
{
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(() -> System.out.println("Hello from thread"));
        t.start();
        t.join();
        System.out.println("Main finished");
    }
}
