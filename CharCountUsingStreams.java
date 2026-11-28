public class CharCountUsingStreams
{
    public static void main(String[] args) {
        String s = "hello world";
        long l = s.chars().filter(c -> c == 'l').count();
        System.out.println("'l' appears " + l + " times");
    }
}
