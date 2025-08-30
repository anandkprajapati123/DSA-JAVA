// COLLECTION FRAMEWORK=>
// an architecture to store and manipulate the group of objects
// In java, collections are part of the java collections framework(JCF), which is a unified 
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        Iterator<Integer> iterator=numbers.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
