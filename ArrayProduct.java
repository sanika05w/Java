public class ArrayProduct
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        long p = 1;
        for (int x : a) p *= x;
        System.out.println("Product = " + p);
    }
}
