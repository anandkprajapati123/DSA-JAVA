import java.util.ArrayList;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc=new Scanner(System.in);

        // list.add(16);
        // list.add(17);
        // list.add(13);
        // list.add(14);
        // list.add(11);
        // list.add(111);
        // list.add(199);
        // System.out.println(list.contains(19));
        // System.out.println(list);
        // list.set(0,99);
        // list.remove(2);
        // System.out.println(list);
        // System.out.println(list.size());
        // System.out.println(list.contains(111));

        // Input
        // System.out.print("Enter the elements: ");
        // for(int i=0;i<5;i++){
        //     list.add(sc.nextInt());
        // }

        // Get item at any index (output)
        // System.out.println("Printing the elements: ");
        // for(int i=0;i<5;i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();
        // System.out.println(list);


        // MaxValue
        // int[] arr={1,2,3,44,222};
        // System.out.println(max(arr));


        // Swap
        int[] arr={22,33,44,55,66};
        swap(arr,0,2);
        // System.out.println(Arrays.toString(arr));


        // Reverse
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }


    // MaxValue
    // static int max(int[] arr){
    //     int max=arr[0];
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     return max;
    // }

    // Reverse array
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
