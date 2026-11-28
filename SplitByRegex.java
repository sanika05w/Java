public class SplitByRegex
{
    public static void main(String[] args) {
        String s = "red,green;blue yellow";
        for (String w : s.split("[,;\\s]+")) System.out.println(w);
    }
}
