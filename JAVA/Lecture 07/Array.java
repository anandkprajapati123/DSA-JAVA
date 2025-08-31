import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // 1D Array

        // int[] arr=new int[5];
        // System.out.println(arr[3]);
        // String[] str=new String[5];
        // System.out.println(str[3]);

        // System.out.print("Enter the element: ");
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // for(int num: arr){
        //     System.out.print(num+" ");
        // }
        // System.out.println();
        // System.out.println(Arrays.toString(arr));

        // String[] str=new String[4];
        // for(int i=0;i<str.length;i++){
        //     str[i]=sc.next();
        // }
        // for(int i=0;i<str.length;i++){
        //     System.out.print(str[i]+" ");
        // }
        // System.out.println();
        // System.out.println(Arrays.toString(str));
        // str[1]="Anand";
        // System.out.println("updated str : "+Arrays.toString(str));


        // Mltidimensional Array
        
        // Take Input
        int[][] arr={{1,2,3},{4,5},{6,7,8,9}};
        // int[][] arr=new int[3][3];
        System.out.println(arr.length);
        for(int row=0;row<arr.length;row++){
        // for each col in every row
            for(int col=0;col<arr[row].length;col++){
                // arr[row][col]=sc.nextInt();
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        // Print Output
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+" ");
        //         System.out.println(Arrays.toString(arr[row]));
        //     }
        //     System.out.println();
        // }


        // OR
        // for(int row=0;row<arr.length;row++){
        //     System.out.println(Arrays.toString(arr[row])+" ");
        // }

        // OR
        // for(int[] a:arr){ // every single element in the array itself is an array
        //     System.out.println(Arrays.toString(a));
        // }

    }
}
