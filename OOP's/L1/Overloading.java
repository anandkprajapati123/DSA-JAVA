// Overloading is a concept of OOPS in which we can create multiple versions of the same entity in the same scope.
// In this example, we are creating multiple methods with the same name but different parameters.

class Addition {
    public int add(int a, int b) {
        int c = a + b;
        return c;
    }
    public int add(int a, int b, int c) {
        int d;
        d = a + b + c;
        return d;
    }
    public double add(double i,double j){
        double k = i + j;
        return k;
    }
    public String add(String s1, String s2) {
        String s3 = s1 + s2;
        return s3;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("sum of 10 20 and 30 is: " + obj.add(10, 20, 30));
        System.out.println("sum of 10.5 and 20.6 is: " + obj.add(10.5, 20.6));
        System.out.println("concatenation of Good and Morning is: " + obj.add("Good", "Morning !"));
    }
}
