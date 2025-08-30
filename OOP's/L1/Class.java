// In programming any real world entity is an object. An object is an instance of a class. A class is a blueprint of an object. A class is collection of objects.
class Student {
    int rollNo;
    String name;
    double per;
}

public class Class {
    public static void main(String[] args) {
        Student s = new Student();
        s.rollNo = 11;
        s.name = "Anand";
        s.per = 85.3;
        System.out.println("Roll No: " + s.rollNo);
        System.out.println("Name: " + s.name);
        System.out.println("Person: " + s.per);
    }
}
