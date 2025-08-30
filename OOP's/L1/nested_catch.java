class nested_catch {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
            try{
                String a = "Anand";
                System.out.println(a.toLowerCase());
            }
            catch(NullPointerException n){
                System.out.println("null can not be converted to lower case");
            }
        }
        System.out.println("main method ended successfully");
    }
}
