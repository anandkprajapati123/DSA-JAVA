import java.util.*;

public class Practice {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // Q.1: Print Sum of 1 to n
    // int n = sc.nextInt();
    // int sum=0;
    // for(int i=0;i<=5;i++){
    //     sum=sum+i;
    // }
    // System.out.println(sum);

    // for(int i=1;i<11;i++){
    //     System.out.println(i*n);
    // }

    // Q.2
    // int a=sc.nextInt();
    // int b=sc.nextInt();
    // int c=sc.nextInt();
    // int max=Math.max(c,Math.max(a,b));
    // System.out.println(max);

    // Q.3 Fibonacci series
    // 0 1 1 2 3 5 8 13 21 34 55 89 144 233
    // int n=sc.nextInt();
    // int prev=0;
    // int curr=1;
    // int count=2;
    // while(count<=n){
    //     int temp=curr;
    //     curr=curr+prev;
    //     prev=temp;
    //     count++;
    // }
    // System.out.println(curr);

    // Q.4 Count Nums
    // int n=23453;
    // int count=0;
    // while(n>0){
    //     int lastDigit=n%10;
    //     if(lastDigit==3){
    //         count++;
    //     }
    //     n=n/10;
    // }
    // System.out.println(count);

    // Q.5 Palindrome
    // 121 12321 1234321
    int n=12321;
    int rev=0;
    int temp=n;
    while(n>0){
        int lastDigit=n%10;
        rev=rev*10+lastDigit;
        n=n/10;
    }
    if(temp==rev){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not Palindrome");
    }
    System.out.println(rev);

   } 
}