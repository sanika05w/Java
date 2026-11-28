public class ThreadJoinDemo
{
    public static void main(String[] args) throws Exception {
        Thread a = new Thread(() -> System.out.println("Task A done"));
        Thread b = new Thread(() -> System.out.println("Task B done"));
        a.start();
        a.join();
        b.start();
        b.join();
        System.out.println("All tasks complete");
    }
}
