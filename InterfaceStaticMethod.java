public class InterfaceStaticMethod
{
    public static void main(String[] args) {
        System.out.println(MathUtil.square(9));
        System.out.println(new Impl().cube(3));
    }

    interface MathUtil {
        static int square(int x) { return x * x; }
        default int cube(int x) { return x * x * x; }
    }
    static class Impl implements MathUtil {}
}
