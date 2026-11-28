public class StringBuilderDemo
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(0, ">> ");
        sb.reverse();
        System.out.println(sb);
    }
}
