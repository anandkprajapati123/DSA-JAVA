class throws_keyword {
    public static void main(String[] args) throws InterruptedException {
        // for(int i=1;i<=10;i++){
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }

        for(int i=0;i<=10;i++){
            try{
                // System.out.println(i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
    } 
}
