public class CountLinesInText
{
    public static void main(String[] args) {
        String text = "line one\nline two\nline three";
        System.out.println("Lines = " + text.split("\n").length);
    }
}
