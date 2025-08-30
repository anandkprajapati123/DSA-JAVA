@FunctionalInterface
interface Square{
    int calculate(int x);
}
public class functional_interface {
    public static void main(String[] args) {
        int n=5;
        Square s = (int x) -> x * x;
        int ans=s.calculate(n);
        System.out.println("Square of " + n + " is: " + ans);
    }
}
