public class HierarchicalInheritance
{
    public static void main(String[] args) {
        new Cat().meow();
        new Dog().bark();
        new Cat().eat();
    }

    static class Animal { void eat() { System.out.println("Eating"); } }
    static class Dog extends Animal { void bark() { System.out.println("Barking"); } }
    static class Cat extends Animal { void meow() { System.out.println("Meowing"); } }
}
