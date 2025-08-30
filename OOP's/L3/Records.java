// Special type of class which is immutable type of class
record Student(String name ,String admission_no , int Rollno){}
record Person(String name, int age) {}
public class Records {
    public static void main(String[] args) {
        Person p = new Person("Anand", 20);
        System.out.println(p.name());  // Getter
        System.out.println(p.age());   // toString
        System.out.println(p.toString()); // both are same
        Student s = new Student("Anand Prajapati", "2023b0151023", 11);
        System.out.println("Name :- "+s.name());
        System.out.println(s);
    }
}
