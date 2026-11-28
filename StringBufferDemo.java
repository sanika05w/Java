public class StringBufferDemo
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Rocks");
        sb.replace(0, 4, "Coding");
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
