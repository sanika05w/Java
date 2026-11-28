import java.util.*;

public class BitSetDemo
{
    public static void main(String[] args) {
        BitSet b = new BitSet();
        b.set(1); b.set(3); b.set(5);
        System.out.println(b + " cardinality=" + b.cardinality());
    }
}
