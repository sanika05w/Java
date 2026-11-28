public class StringRotationCheck
{
    public static void main(String[] args) {
        String a = "ABCD", b = "CDAB";
        boolean rot = a.length() == b.length() && (a + a).contains(b);
        System.out.println(rot ? "Rotation" : "Not a rotation");
    }
}
