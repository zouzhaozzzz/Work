package question14;

public class Circle extends Shape {
    final double PI=Math.PI;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI*radius*radius;
    }


    public double girth() {
        return PI*radius*2;
    }
}
