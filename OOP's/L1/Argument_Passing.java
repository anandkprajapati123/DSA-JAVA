// When we pass any data within parenthesis while calling any method/function we say we are passing arguments.

class MyMath {
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Sum of a and b is: " + c);
    }
}
public class Argument_Passing {
    public static void main(String[] args) {
        MyMath m=new MyMath();
        m.add(10,15);
    }
}
