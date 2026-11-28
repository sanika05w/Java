public class StringPermutations
{
    public static void main(String[] args) {
        permute("", "ABC");
    }

    static void permute(String prefix, String rest) {
        if (rest.isEmpty()) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < rest.length(); i++) {
            permute(prefix + rest.charAt(i), rest.substring(0, i) + rest.substring(i + 1));
        }
    }
}
