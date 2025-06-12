package CollectionQueue;
import java.util.ArrayDeque;
public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> a=new ArrayDeque<>();
        a.add(34);
        a.add(4);
        a.add(90);
        a.add(1);
        System.out.println(a);
        System.out.println(a.remove());
        System.out.println(a.removeLast());
        a.addFirst(45);
        System.out.println(a);
        System.out.println(a.remove());
        System.out.println(a.getFirst());

    }
}
