public class MultipleCatchDemo
{
    public static void main(String[] args) {
        try {
            int[] a = new int[3];
            a[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic problem");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}
