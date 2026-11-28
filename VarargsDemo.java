public class VarargsDemo
{
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(10, 20, 30, 40));
    }

    static int sum(int... n) {
        int t = 0;
        for (int x : n) t += x;
        return t;
    }
}
