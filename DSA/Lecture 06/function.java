import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        // sum();
        // greeting();

        // int ans=sum2();
        // System.out.println("sum = "+ans);

        // String str=greet();
        // System.out.println(str);

        // int res=sum3(2,3);
        // System.out.println(res);

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String naam=sc.next();
        String personalised=myGreet(naam);
        System.out.println(personalised);
    }

    // Sum method 
    // static void sum(){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter number 1:");
    //     int num1=sc.nextInt();
    //     System.out.print("Enter number 2:");
    //     int num2=sc.nextInt();
    //     int sum=num1+num2;
    //     System.out.println("The sum of "+num1+ " and "+num2+" is "+sum);
    // }

    // greet method
    // static void greeting(){
    //     System.out.println("Hello Java");
    // }

    // sum2
    // static int sum2(){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter number 1:");
    //     int num1=sc.nextInt();
    //     System.out.print("Enter number 2:");
    //     int num2=sc.nextInt();
    //     int sum=num1+num2;
    //     return sum;
    // }

    // static String greet(){
    //     String greeting ="how are you";
    //     return greeting;
    // }

    // static int sum3(int a,int b){
    //     int sum=a+b;
    //     return sum;
    // }

    static String myGreet(String name){
        String msg="Hello "+name;
        return msg;
    }
}
