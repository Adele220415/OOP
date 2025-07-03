// Abstract class
abstract class Vehicle {
    protected String model;
    public Vehicle(String model) {
        this.model = model;
    }
    // Abstract method

    abstract void start();
    // concrete method
    public void display(){
        System.out.println("Model: " + model);
    }

    interface Rentable {
        double calculateRentalCost(int days);
    }
    
}
    // concrete class inplementing abstract class and interface
    class Car extends Vehicle implements Rentable {
        public Car(String model) {
            super (model);
        }
        @Override
        void start() {
            System.out.println(model + "car started with key ignition.");
        }

        @Override
        public double calculateRentalCost(int days) {
            return days * 50.0;
        }
    }

    public class Main {
        public Static void main(String[] args) {
            Car car = new Car("Toyota Camry");
            car.display();
            car.start();
            System.out.println("Rental cost for 3 days: $" + car.calculateRentalCost(3));
        }
    }
