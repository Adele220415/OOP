public class Car{
    //Fields
    String brand;
    int speed;

    //methods
    public void display(){
        System.out.println("Brand: " + brand + ", Speed: " + speed + "km/h");
    }

    public static void main(String[]args){
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.speed = 120;
        car1.display();
    }

   
}