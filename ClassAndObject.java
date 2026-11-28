public class ClassAndObject
{
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sanika";
        s.age = 21;
        s.display();
    }

    static class Student {
        String name;
        int age;
        void display() {
            System.out.println(name + " is " + age + " years old");
        }
    }
}
