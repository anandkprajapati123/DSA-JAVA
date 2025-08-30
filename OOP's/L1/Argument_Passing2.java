public class Argument_Passing2 {
    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println(("Before incrementing x=" + x +",y="+ y));
        incrment(x,y);
        System.out.println(("After incrementing x=" + x +",y=" + y));
    }

    public static void incrment(int a, int b) {
        a=a+5;
        b=b+5;
        System.out.println("Inside incrment method: " + a + " " + b);
    }
}
