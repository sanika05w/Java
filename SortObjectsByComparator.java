import java.util.*;

public class SortObjectsByComparator
{
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ravi", 30));
        people.add(new Person("Asha", 22));
        people.add(new Person("Meera", 26));
        people.sort(Comparator.comparingInt(p -> p.age));
        for (Person p : people) System.out.println(p.name + " " + p.age);
    }

    static class Person {
        String name; int age;
        Person(String name, int age) { this.name = name; this.age = age; }
    }
}
