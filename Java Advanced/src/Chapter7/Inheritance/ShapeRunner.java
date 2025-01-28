package Chapter7.Inheritance;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape objShape = new Shape(8,7);
        objShape.display();

        MyRectangle objRectangle = new MyRectangle(9,8);
        objRectangle.display();

        Circle c = new Circle(8);
        c.display();
    }
}
