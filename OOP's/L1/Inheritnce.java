// class Vehicle{
//     void start(){
//         System.out.println("starting...");
//     }
//     void accelerate(){
//        System.out.println("accelerating..."); 
//     }
//     void turnleft(){
//        System.out.println("turning left..."); 
//     }
//     void turnright(){
//        System.out.println("turning right..."); 
//     }
// }
// class Car extends Vehicle{
//     void reverse(){
//         System.out.println("reversing...");
//     }
// }
class Vehicle{
    public Vehicle(String type){
        System.out.println("vehicle constructor called..."+type);
    }
    public Vehicle(){
        System.out.println("Non parameterized vehicle constructor called...");
    }
}
class Car extends Vehicle{
    public Car(){
        // super("four wheeler"); //for parameterized
        super(); //for non parameterized
        System.out.println("car constructor called...");
    }
}

public class Inheritnce {
    public static void main(String[] args) {
        Car car=new Car();
        // car.start();
        // car.accelerate();
        // car.turnleft();
        // car.turnright();
        // car.reverse()
    }
}
