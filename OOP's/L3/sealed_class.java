import java.lang.*;
sealed class Human permits Anand, utkarsh, kundan {
    public void eat() {
        System.out.println("Human is eating-->default");
    }
}
non-sealed class Anand extends Human{
    public void eat() {
        System.out.println("Anand is eating-->overridden");
    }
}
final class utkarsh extends Human{
    public void eat() {
        System.out.println("Utkarsh is eating-->overridden");
    }
}
final class kundan extends Human {
    public void eat() {
        System.out.println("Kundan is eating-->overridden");
    }
}

public class sealed_class {
    public static void main(String[] args) {
        Human h1=new Anand();
        Human h2=new utkarsh();
        Human h3=new kundan();

        h1.eat();
        h2.eat();
        h3.eat();
    }
}
