import java.util.Arrays;

public class Shadowing {
    static int x=40; // this will be shadowed at line 6
    public static void main(String[] args) {
        // System.out.println(x); // 40
        // int x=30; 
        // System.out.println(x); // 30
        // fun();

        // var(1, 2, 3, 4, 5);
        var("Anand", "Kumar", "Prajapati");

        multiple(1, 2, 3); // multiple arguments example
    }

    // shadowing example
    // static void fun(){
    //     System.out.println(x); // 40
    // }

    // variable arguments (varargs) example
    static void multiple(int a, int b, int c){
        System.out.println(a + " " + b + " " + c);
    }

    static void var(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
