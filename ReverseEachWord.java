public class ReverseEachWord
{
    public static void main(String[] args) {
        String s = "I love Java";
        for (String w : s.split(" ")) {
            System.out.print(new StringBuilder(w).reverse() + " ");
        }
        System.out.println();
    }
}
