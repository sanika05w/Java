public class StudentGradeSystem
{
    public static void main(String[] args) {
        Student s = new Student("Ravi", new int[]{78, 85, 92});
        System.out.println(s.name + " -> average " + s.average() + ", grade " + s.grade());
    }

    static class Student {
        String name;
        int[] marks;
        Student(String name, int[] marks) { this.name = name; this.marks = marks; }
        double average() {
            int sum = 0;
            for (int m : marks) sum += m;
            return (double) sum / marks.length;
        }
        char grade() {
            double avg = average();
            return avg >= 90 ? 'A' : avg >= 75 ? 'B' : avg >= 50 ? 'C' : 'F';
        }
    }
}
