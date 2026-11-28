public class CountOccurrencesInArray
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 4, 2, 5};
        int key = 2, count = 0;
        for (int x : a) if (x == key) count++;
        System.out.println(key + " appears " + count + " times");
    }
}
