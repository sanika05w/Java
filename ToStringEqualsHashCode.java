import java.util.*;

public class ToStringEqualsHashCode
{
    public static void main(String[] args) {
        Person a = new Person("Asha", 20), b = new Person("Asha", 20);
        System.out.println(a);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());
    }

    static class Person {
        String name; int age;
        Person(String name, int age) { this.name = name; this.age = age; }
        public String toString() { return name + " (" + age + ")"; }
        public boolean equals(Object o) {
            if (!(o instanceof Person)) return false;
            Person p = (Person) o;
            return name.equals(p.name) && age == p.age;
        }
        public int hashCode() { return Objects.hash(name, age); }
    }
}
