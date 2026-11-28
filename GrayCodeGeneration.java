public class GrayCodeGeneration
{
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < (1 << n); i++) {
            int g = i ^ (i >> 1);
            System.out.println(String.format("%" + n + "s", Integer.toBinaryString(g)).replace(' ', '0'));
        }
    }
}
