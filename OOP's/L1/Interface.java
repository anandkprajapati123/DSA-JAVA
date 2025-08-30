interface Animal {
    void makesoond();
    public abstract void eat();
}
class Elephant implements Animal{
    @Override
    public void makesoond(){
        System.out.println("trumpet");
    }
    @Override
    public void eat(){
        System.out.println("grasses");
    }
}
class Lion implements Animal{
    @Override
    public void makesoond(){
        System.out.println("roar");
    }
    @Override
    public void eat(){
        System.out.println("meat");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal animal=new Elephant();
        animal.makesoond();
        animal.eat();
        Animal animal1=new Lion();
        animal1.makesoond();
        animal1.eat();
    }
}
