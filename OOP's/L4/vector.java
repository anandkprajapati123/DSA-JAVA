import java.util.Vector;
public class vector {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(4);
        vector.add(5);
        vector.add(6); 
        vector.add(7);
        System.out.println(vector);

        // Accessing element using index
        System.out.println("element at index 1: "+vector.get((2)));
        // removed an element
        System.out.println("eleent remove at index: "+vector.remove(0));
        System.out.println(vector);
    }
}
