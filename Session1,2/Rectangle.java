public class Rectangle {
    private double length;
    private double width;

    public void setLength(double length) {
if (length > 0) {
this.length = length;
} else {
this.length = 1.0; // Default value
}
}
public void setWidth(double width) {
if (width > 0) {
this.width = width;
} else {
this.width = 1.0; // Default value
}
}

    public double getlength(){
        return length;
    }

    public double getwidth(){
        return width;

    }

    public double calcArea(){
        return length * width;
    }

    public double calcPerimeter(){
        return 2 * (length + width);
    }

    // public  void area(double length, double width) {
    //     area = length * width;
    //         System.out.println("Area: " + );
    // }
}