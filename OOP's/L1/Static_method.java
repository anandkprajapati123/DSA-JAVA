// Static Method is the method that belongs to the class rather than an instance of the class.
// Static methods can be called without creating an instance of the class.

class Mymath {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class Static_method {
    public static void main(String[] args) {
        System.out.println("The sum of 10 and 20 is: " +Mymath.add(10,20));
    }
}
