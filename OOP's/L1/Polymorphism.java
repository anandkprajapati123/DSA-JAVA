// Polymorphism is the ability of an object to take on many forms.
// In Java, polymorphism is mainly divided into two types:
// 1. Compile-time polymorphism (Method Overloading)
// 2. Runtime polymorphism (Method Overriding)

class Shape {
    public void area(double rad){
        double ar=Math.PI*Math.pow(rad,2);
        System.out.println("area of circle = "+ar);
    }
    public void area(int side){
        int ar=side*side;
        System.out.println("area of square = "+ar);
    }
    public void area(int length,int breadth){
        int ar=length*breadth;
        System.out.println("area of rectangle = "+ar);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape s=new Shape();
        s.area('A'); // square
        s.area(10.0); // circle
        s.area(5,7); // rectangle
    }
}
