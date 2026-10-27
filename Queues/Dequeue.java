import java.util.*;
import java.util.LinkedList;
public class Dequeue {
    
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println(deque.getLast());
    }
}
