abstract class Shape {
    protected String name;
    public Shape(String name) {
        this.name = name;
    }

    abstract double calculateArea();
    public void describe() {
        System.out.println("This is a " + name + "with area" + calculateArea);

    }

}

class Circle extends Shape{
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.pi * radius * radius;
    }
}

class Rectangle extends Shape{
    private double length, width;
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculatedArea {
        return length * width;
    }
}

public class Main {
    public Static void main(String[] args) {
        Shape cicle = new Circle("Circle", 5.0);
        Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        Shape.display;
        System.out.println("The area of the shapes are: " + calculatedArea);
    }
}