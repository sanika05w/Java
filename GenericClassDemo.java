public class GenericClassDemo
{
    public static void main(String[] args) {
        Box<Integer> a = new Box<>(10);
        Box<String> b = new Box<>("Java");
        System.out.println(a.get() + " " + b.get());
    }

    static class Box<T> {
        private T value;
        Box(T value) { this.value = value; }
        T get() { return value; }
    }
}
