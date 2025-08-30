// Abstraction in Java is a process of hiding the implementation details and showing only the functionality to the user.

class Car {
    public void turnOn() {
        System.out.println("Car is turned on.");
    }
    public void drive() {
        System.out.println("Car is driving.");
    }
    public void turnOff() {
        System.out.println("Car is turned off.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car c = new Car();
        c.turnOn();
        c.drive();
        c.turnOff();
    }
}

