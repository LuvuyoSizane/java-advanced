package Chapter7.Inheritance;

public class TriangleRunner {
    public static void main(String[] args) {
        Triangle objTriangle = new Triangle(8,7,9);
        System.out.println( objTriangle.display());

        MyRectangle objRectangle = new MyRectangle(9,8);
        objRectangle.display();

        Circle c = new Circle(8);
        c.display();
    }
}
