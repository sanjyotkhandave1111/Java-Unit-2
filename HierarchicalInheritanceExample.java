
class Vehicle {
    void start() {
        System.out.println("The vehicle starts.");
    }
}


class Car extends Vehicle {
    void drive() {
        System.out.println("The car is being driven.");
    }
}


class Bike extends Vehicle {
    void ride() {
        System.out.println("The bike is being ridden.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("Car Actions:");
        car.start();
        car.drive();

        System.out.println();


        Bike bike = new Bike();
        System.out.println("Bike Actions:");
        bike.start();
        bike.ride();
    }
}

