// Encapsulation in Java is the process of binding or wrapping the data (variables) and code (methods) together as a single unit

class Student {
    private int rollno;
    private String name;
    private double marks;

    public void setStudent(int r, String s, double p) {
        rollno = r;
        name = s;
        marks = p;
    }
    public void showStudent(){
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudent(11, "John", 85.5);
        s.showStudent();

        Student p = new Student();
        p.setStudent(12, "Alice", 90.0);
        p.showStudent();
    }
}
