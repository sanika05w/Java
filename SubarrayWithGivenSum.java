public class SubarrayWithGivenSum
{
    public static void main(String[] args) {
        int[] a = {1, 4, 20, 3, 10, 5};
        int target = 33;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum == target) { System.out.println("From index " + i + " to " + j); return; }
            }
        }
        System.out.println("Not found");
    }
}
