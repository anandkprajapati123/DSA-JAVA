public class multiple_try_catch {
    public static void main(String[] args) {

        // Multiple try catch block

        // try{
        //     int a=10,b=0;
        //     int c=a/b;
        //     System.out.println(c);
        // }
        // catch(ArithmeticException a){
        //     System.out.println(a);
        //     System.out.println("can not devide by zero");
        // }
        // try{
        //     int a[]={2,4,6,8};
        //     System.out.println(a[4]);
        // }
        // catch(ArrayIndexOutOfBoundsException b){
        //     System.out.println(b);
        //     System.out.println("Beyond the array limit");
        // }
        
        // Multiple catch block

        try{
            int a=10,b=0;
            int c=a/b;
            System.out.println(c);

            int arr[]={2,3,4};
            System.out.println(arr[0]);

            String str="Anand";
            System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array exception");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        catch(NumberFormatException n){
            System.out.println("Number exception");
        }
        System.out.println("All type exception handled");
    }
}
