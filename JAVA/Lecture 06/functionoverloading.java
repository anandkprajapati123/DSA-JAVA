public class functionoverloading {
    public static void main(String[] args) {
        fun(5); // calls fun(int a)
        fun("Hello"); // calls fun(String name)
        int ans=fun(10, 20); // calls fun(int a, int b)
        System.out.println("Sum is: " + ans);
    }
    static void fun(int a){
        System.out.println("first overloaded function");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("second overloaded function");
        System.out.println(name);
    }
    static int fun(int a, int b){
        System.out.println("third overloaded function");
        return a+b;
        // System.out.println(a + " " + b);
    }
}
