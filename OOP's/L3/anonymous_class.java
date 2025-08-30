class Demo{
    public void view(){
        System.out.println("Inside the demo class");
    }
}
class MyClass{
    Demo d1 = new Demo() {
        @Override
        public void view() {
            super.view();
            System.out.println("inside the anonymous class");
        }
    };
}
public class anonymous_class {
    public static void main(String[] args) {
        MyClass cls=new MyClass();
        cls.d1.view();
    }
}