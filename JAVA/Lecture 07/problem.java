import java.util.Arrays;

public class problem {
  public static void main(String[] args) {
    // Swap alternate
    // int[] arr = { 1, 2, 3, 4, 5, 6 };
    int[] arr={1,2,3,4,5};
    swapAlternate(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void swapAlternate(int[] arr){
    for(int i=0;i<arr.length;i+=2){
      if(i+1<arr.length){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
      }
    }
  }
}
