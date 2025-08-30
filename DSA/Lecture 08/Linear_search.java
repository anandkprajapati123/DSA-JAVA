package Java.Lecture8;
public class Linear_search {
    public static void main(String[] args) {
        int[] nums={2,44,-3,6,-9,99};
        int target=6;
        int ans=linearSearch(nums, target);
        System.out.println(ans);
    }

    // search in the array: return the index of item found otherwise if item not found return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
    }
}
