public class SingleNumberXor
{
    public static void main(String[] args) {
        int[] a = {4, 1, 2, 1, 2};
        int r = 0;
        for (int x : a) r ^= x;
        System.out.println("Single number = " + r);
    }
}
