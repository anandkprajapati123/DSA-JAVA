import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {

        //Q.1 largest and smallest in number among three numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first=sc.nextInt();
        System.out.print("Enter second number: ");
        int second=sc.nextInt();
        System.out.print("Enter third number: ");
        int third=sc.nextInt();
        int largest=largest(first, second, third);
        int smallest=smallest(first, second, third);
        System.out.printf("Largest of three numbers %d %d and %d is: %d%n", first, second, third, largest);
        System.out.printf("Smallest of three numbers %d %d and %d is: %d%n", first, second, third, smallest);
    }
    static int largest(int a,int b,int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
    static int smallest(int a,int b,int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }
}
