public class RunnableDemo
{
    public static void main(String[] args) throws Exception {
        Runnable r = new Task();
        Thread t = new Thread(r);
        t.start();
        t.join();
    }

    static class Task implements Runnable {
        public void run() { System.out.println("Running task in " + Thread.currentThread().getName().startsWith("Thread")); }
    }
}
