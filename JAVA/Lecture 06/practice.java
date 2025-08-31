import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // boolean ans=isPrime(n);
        // System.out.print(ans);

        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
        // System.out.println(isArmstrong(n));
    }

    // Q.1 prime number
    // static boolean isPrime(int n){
    //     if(n<=1){
    //         return false;
    //     }
    //     int c=2;
    //     while(c*c<=n){
    //         if(n%c==0){
    //             return false;
    //         }
    //         c++;
    //     }
    //     return c*c>n;
    // }

    // Q.2 armstrong number
    static boolean isArmstrong(int n){
            int original=n;
            int sum=0;
            while(n>0){
                int d=n%10;
                sum +=d*d*d;
                n=n/10;
            }
            return sum==original;
    }
}
