import java.util.ArrayList;

public class Argument_Passing3 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(4);
        System.out.println("Before changing myList: " + myList);
        change(myList);
        System.out.println("After changing myList: " + myList);
    }
    public static void change(ArrayList<Integer> myList) {
        // myList=new ArrayList<>();
        myList.add(3);
        myList.add(5);
    }
}
