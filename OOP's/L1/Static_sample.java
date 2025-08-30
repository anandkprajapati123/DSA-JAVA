public class Static_sample {
    // static int a=10; // if we not use static then we get an error
    int a=10;
    public static void main(String[] args) {
        Static_sample s=new Static_sample();
        System.out.println("a is: " +s.a);
    }
}
