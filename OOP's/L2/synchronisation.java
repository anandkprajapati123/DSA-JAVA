class Bus implements Runnable {
    int available = 1;
    int passenger;

    Bus(int passenger) {
        this.passenger = passenger;
    }

    public synchronized void run() {
        String name = Thread.currentThread().getName();
            if (available >= passenger) {
                System.out.println(name + " reserved seat");
                available -= passenger;
            } else {
                System.out.println(name + " Sorry, no seat available");
            }
    }
}

public class synchronisation {
    public static void main(String[] args) {
        Bus r = new Bus(1);

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("Alice");
        t2.setName("Chef");
        t3.setName("Bob");

        t1.start();
        t2.start();
        t3.start();
    }
}
