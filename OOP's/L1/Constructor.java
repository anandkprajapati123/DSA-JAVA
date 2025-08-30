// A constructor is a special method that is called when an object is instantiated.
// It is used to initialize the object.
// Have the same name as the class.
// It does not have a return type.
// It can have parameters.

class Useconstructor {
    private int acctId;
    private String name;
    private double balance;
    // Constructor with no parameters
    public Useconstructor(int id, String n, double b) {
        acctId = id;
        name = n;
        balance = b;
        acctId = 1001;
        name = "John Doe";
        balance = 2000.0;
    }
    public void ShowAccount(){
        System.out.println("id="+acctId);
        System.out.println("name="+name);
        System.out.println("balance="+balance);
    }
}
public class Constructor{
    public static void main(String[] args) {
        Useconstructor obj = new Useconstructor(1001, "John Doe", 2000.0);
        Useconstructor obj2 = new Useconstructor(1002, "John", 3000.0);
        obj.ShowAccount();
        obj2.ShowAccount();
    }
}