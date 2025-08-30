// An exception
public class exception{
    public static void main(String args[]){
        // Exception handling
        try{
            int a=10,b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Can not devide by zero "+e);
        }
        finally{
            System.out.println("End of program");
        }
    }
}