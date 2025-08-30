public class try_catch_finally {
    public static void main(String[] args) {
        try{
            System.out.println("Anand");
            int a=20,b=0;
            int c=a/b;
            System.out.println(c);
            System.out.println("like");
        }
        catch(ArithmeticException e){
            System.out.println("can not devide by zero");
        }
        finally{
            System.out.println("subscribe");
        }
        System.out.println("Main method ended");
    }
}
