import java.util.*;

public class Conditions {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        // int age = sc.nextInt();
        // if(age>18){
        //     System.out.println("Adult");
        // }else{
        //     System.out.println("Not Adult");
        // }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

        // int x = sc.nextInt();
        // if(x%2==0){
        //     System.out.println("Even");
        // } else{
        //     System.out.println("Odd");
        // }

        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // if(a==b){
        //     System.out.println("a is equal to b");
        // } else if(a>b){
        //         System.out.println("a is greater");
        // } else{
        //     System.out.println("b is greater");
        // }


        // int button=sc.nextInt();
        // if(button==1){
        //     System.out.println("Hello");
        // } else if(button==2){
        //     System.out.println("Namaste");
        // } else if(button==3){
        //     System.out.println("Bonjour");
        // } else{
        //     System.out.println("Invalid button");
        // }

        // int button=sc.nextInt();
        // switch(button){
        //     case 1: System.out.println("Hello");
        //     break;
        //     case 2: System.out.println("Namaste");
        //     break;
        //     case 3: System.out.println("Bonjour");
        //     break;
        //     default: System.out.println("Invalid button");
        // }
    }
}