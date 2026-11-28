public class GenericMethodDemo
{
    public static void main(String[] args) {
        printArray(new Integer[]{1, 2, 3});
        printArray(new String[]{"a", "b", "c"});
    }

    static <T> void printArray(T[] arr) {
        for (T x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
