class trycatch_throw {
    public static void Wait() throws InterruptedException{
        for(int i=1;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) throws InterruptedException{
        try{
            Wait();
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("exception handled");
        }
        System.out.println("main method ended");
    }
}
