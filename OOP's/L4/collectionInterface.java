import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class collectionInterface {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Welcome");
        list.add("to");
        list.add("Java");
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
