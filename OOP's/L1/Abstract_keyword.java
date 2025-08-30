class A{
    public void show(){
        System.out.print("In show of A");
    }
}
class B extends A{
    public void show() {
        System.out.print("In show of B");
    }
}

public class Abstract_keyword {
    public static void main(String[] args) {
        A ref=new A();
        ref.show();
    }
}
