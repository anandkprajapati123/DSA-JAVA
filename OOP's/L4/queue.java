import java.util.Queue;
import java.util.Stack;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.add("Anand");
        queue.add("Alice");
        queue.add("Ankit");
        System.out.println("removed element: "+queue.remove());
        System.out.println("peeked element: "+queue.remove());
        System.out.println("Is queue empty? "+queue.isEmpty());
    }
}
