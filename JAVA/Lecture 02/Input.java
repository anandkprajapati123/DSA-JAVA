import java.util.*; //import package

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); //input le liya
        // String name = sc.next(); //for one string
        String name = sc.nextLine(); //for more than two string
        int a = sc.nextInt();
        int b = sc.nextInt(); //store value
        int sum=a+b;
        System.out.println(sum);
        System.out.println(name);
    }
}
