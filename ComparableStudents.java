import java.util.*;

public class ComparableStudents
{
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>(List.of(new Student("Ravi", 78), new Student("Asha", 92), new Student("Meera", 85)));
        Collections.sort(l);
        for (Student s : l) System.out.println(s.name + " " + s.marks);
    }

    static class Student implements Comparable<Student> {
        String name; int marks;
        Student(String n, int m) { name = n; marks = m; }
        public int compareTo(Student o) { return Integer.compare(o.marks, marks); }
    }
}
