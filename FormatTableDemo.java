public class FormatTableDemo
{
    public static void main(String[] args) {
        String[] names = {"Asha", "Ravi", "Meera"};
        int[] marks = {91, 78, 85};
        System.out.printf("%-10s %5s%n", "Name", "Marks");
        for (int i = 0; i < names.length; i++) System.out.printf("%-10s %5d%n", names[i], marks[i]);
    }
}
