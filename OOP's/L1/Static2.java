class Emp{
    private int age;
    private String name;
    private static String company ="Amazon";
    public Emp(int a, String n) {
        age = a;
        name = n;
    }
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Company: " + company);
    }
}

public class Static2 {
    public static void main(String[] args) {
        Emp e = new Emp(20, "John");
        Emp f = new Emp(25, "Jane");
        Emp g = new Emp(30, "Doe");
        e.display();
        f.display();
        g.display();
    }   
}
