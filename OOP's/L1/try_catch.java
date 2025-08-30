class try_catch {
    public static void main(String[] args) {
        String str="Anand";
        // String str="121";
    try{
        int a=Integer.parseInt(str);
        System.out.println(a);
    }
    catch(NumberFormatException n){
        System.out.println("String "+str+" can   not be converted to integer");
    }

        // String str1=null; // show error
        // try{
        //     System.out.println(str.toUpperCase());
        // }
        // catch(NullPointerException e){
        //     System.out.println("null can not be casted");
        // }

        System.out.println("Main method ended");
    }
}