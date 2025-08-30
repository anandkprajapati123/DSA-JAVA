import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=Sc.nextInt();
        int temp=n;
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(temp==rev){
            System.out.println(temp + " is a palindrome");
        }
        else{
            System.out.println(temp +" is not a palindrome");
        }
    }
}