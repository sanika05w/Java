public class FinalKeywordDemo
{
    public static void main(String[] args) {
        final double PI = 3.14159;
        System.out.println("PI = " + PI);
        System.out.println(new Util().twice(21));
    }

    static class Util {
        final int twice(int x) { return x * 2; }
    }
}
