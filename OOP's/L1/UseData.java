class Data {
    // int a=10; // This show an error because this is instance variable
    static int a=10;
    static{
        System.out.println("Static block:"+a);
    }
    static{
        System.out.println("Static block 2");
    }
    public Data(){
        System.out.println("Constructor");
    }
    public static void show(){
        System.out.println("Static method//Show called");
    }
}
public class UseData{
    public static void main(String[] args) {
    Data.show();
    Data.show();
    // Data d1=new Data();
    // Data d2=new Data();
    Data d3=new Data();
    }
}
