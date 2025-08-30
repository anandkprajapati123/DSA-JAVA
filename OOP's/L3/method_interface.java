// 1.Referance to static method
interface A{
    void sum(int a,int b);
}
class B{
    static void add(int x, int y) {
        int c=x+y;
        System.out.println("The sum is: " + c);
    }
}

public class method_interface {
    public static void main(String[] args) {
        A a = B::add;
        a.sum(10, 20);
    }
}
