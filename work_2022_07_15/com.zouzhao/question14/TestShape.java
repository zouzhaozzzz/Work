package question14;

public class TestShape {
    public static void main(String[] args) {
        Shape[] s = new Shape[]{new Circle(3),new Rect(2,1),new Square(3)};
        for (Shape shape : s) {
            System.out.println(shape.area());
            System.out.println(shape.girth());
        }
    }
}
