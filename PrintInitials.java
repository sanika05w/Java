public class PrintInitials
{
    public static void main(String[] args) {
        String name = "Sanika Rajesh Patil";
        StringBuilder sb = new StringBuilder();
        for (String part : name.split(" ")) sb.append(part.charAt(0)).append('.');
        System.out.println(sb);
    }
}
