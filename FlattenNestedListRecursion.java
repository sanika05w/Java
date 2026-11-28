public class FlattenNestedListRecursion
{
    public static void main(String[] args) {
        Object[] nested = {1, new Object[]{2, new Object[]{3, 4}}, 5};
        flatten(nested);
        System.out.println();
    }

    static void flatten(Object[] arr) {
        for (Object o : arr) {
            if (o instanceof Object[]) flatten((Object[]) o);
            else System.out.print(o + " ");
        }
    }
}
