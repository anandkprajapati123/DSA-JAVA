class nested_try{
    public static void main(String[] args) {
        try{
            try{
                int a[]={2,3,4};
                System.out.println(a[3]);
            } 
            catch(ArrayIndexOutOfBoundsException a){
                System.out.println(a);
            }
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("ended successfully");
    }
}