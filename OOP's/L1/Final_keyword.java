// class Circle{
//     private int rad;
//     private final double pi;
//     public Circle(int r){
//         rad=r;
//         pi=3.14;
//     }
//     public void show(){
//         // ++pi;
//         System.out.println("radius is "+rad);
//         System.out.println("pi is "+pi);
//     }
// }

class Bike {
    public final void topSpeed(){
        System.out.println("Bike running at topspeed of 120kmph");
    }
}
class Honda extends Bike{
    // public void topSpeed(){
    //     System.out.println("Honda running at topspeed of 240kmph");
    // }
}

public class Final_keyword {
    public static void main(String[] args) {
        // Circle obj=new Circle(10);
        // obj.show();
        
        Honda h1=new Honda();
        h1.topSpeed();
    }
}
