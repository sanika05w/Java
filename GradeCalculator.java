public class GradeCalculator
{
    public static void main(String[] args) {
        int marks = 82;
        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else grade = 'F';
        System.out.println("Marks " + marks + " -> Grade " + grade);
    }
}
