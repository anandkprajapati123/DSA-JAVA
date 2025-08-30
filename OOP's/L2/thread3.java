class A extends Thread {
    public void run(){
        String name=Thread.currentThread().getName();
        // try{
            for(int i=1;i<=3;i++){
                System.out.println(name);
                // Thread.sleep(3000);
                // Thread.yield();
                // System.out.println("t1 thread is running");
                // Thread.sleep(1000);
            }
        // }
        // catch(InterruptedException i){
        //     System.out.println("t1 thread terminated");
        // }

        // System.out.println("isAlive method problem...");
    }
}

// This is use for yield() method

// class B extends Thread{
//     public void run(){
//         String name=Thread.currentThread().getName();
//         for(int i=1;i<=3;i++){
//             System.out.println(name);
//         }
//     } 
// }

public class thread3 {
    public static void main(String[] args) {
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        // t1.interrupt(); // This will interrupt the thread t1
        t2.start();
        t3.start();

        
        // This is for join method

        // t2.start();
        // try{
        //     t2.join();
        // }
        // catch(InterruptedException i){
        // }
        // String name=Thread.currentThread().getName();
        // for(int i=1;i<=3;i++){
        //     System.out.println(name);
        // }
        // t1.start();
        // t3.start();


        // This is for yield method

        // A t1=new A();
        // A t2=new A();
        // t1.start();
        // t2.start();


        // This is for stop method

        // A t1=new A();
        // A t2=new A();
        // A t3=new A();

        // t1.setName("thread 1");
        // t2.setName("thread 2");
        // t3.setName("thread 3");

        // t1.start();
        // t2.start();
        // t3.start();
        // t2.stop();


        // IsAlive()

        // A t1=new A();
        // A t2=new A();
        
        // System.out.println(t1.isAlive());
        // t1.start();
        // System.out.println(t1.isAlive());

        // System.out.println(t2.isAlive());
        // t2.start();
        // System.out.println(t2.isAlive());

    }
}
