public class Cars{
    //Fields
    String brand;
    int speed;

    //methods
    public void display(){
        System.out.println("Brand: " + brand + ", Speed: " + speed + "km/h");
    }

  public static void mains(String[]args){
        Cars car2 = new Car();
        car2.brand = "Volkswagen";
        car2.speed = 220;
        car2.display();
    }

}
