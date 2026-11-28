public class CapitalizeFirstLetter
{
    public static void main(String[] args) {
        String s = "java is fun";
        StringBuilder sb = new StringBuilder();
        for (String w : s.split(" ")) {
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
