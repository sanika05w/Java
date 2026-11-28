public class ThrowsDemo
{
    public static void main(String[] args) {
        try {
            risky(0);
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    static void risky(int n) throws Exception {
        if (n == 0) throw new Exception("n must not be zero");
        System.out.println(100 / n);
    }
}
