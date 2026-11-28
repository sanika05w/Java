public class RuntimeMemoryDemo
{
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Processors = " + rt.availableProcessors());
        System.out.println("Max memory (MB) = " + rt.maxMemory() / (1024 * 1024));
    }
}
