class msg{
    public synchronized void show(String name){
        ;;;;;; // 100 code
        synchronized(this){
            for(int i=1;i<=3;i++){
                System.out.println("How are you..."+name);
            }
        }
        ;;;;;;  // 100 code
    }
}
class OurThread extends Thread{

    msg m;
    String name;
    OurThread(msg m,String name){
        this.m=m;
        this.name=name;
    }
    public void run(){
        m.show(name);
    }
}

public class synchronised_block {
    public static void main(String[] args) {
        msg m=new msg();
        OurThread t1=new OurThread(m, "alice");
        OurThread t2=new OurThread(m, "bob");
        t1.start();
        t2.start();
    }
}
