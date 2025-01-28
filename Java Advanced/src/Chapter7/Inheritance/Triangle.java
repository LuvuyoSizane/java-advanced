package Chapter7.Inheritance;

/**
 * The Triangle class represents a triangle, which is a type of shape.
 * It extends the Shape class and adds an additional attribute for the third side of the triangle.
 * It includes methods to calculate the area and perimeter of the triangle, as well as a method to display its details.
 */
public class Triangle extends Shape {

    // The third side of the triangle
    private double thirdside;

    /**
     * Default constructor that creates a triangle with default values.
     * The default values for base, height, and third side are set to 0, 0, and 5 respectively.
     */
    public Triangle(){
        super();
        thirdside = 5;
    }

    /**
     * Constructor that creates a triangle with the specified base, height, and third side.
     *
     * @param base The base length of the triangle.
     * @param height The height of the triangle.
     * @param ts The length of the third side of the triangle.
     */
    public Triangle(double base, double height, double ts){
        super(base, height);
        thirdside = ts;
    }

    /**
     * Calculates the area of the triangle.
     * The area is calculated as (base * height) / 2.
     *
     * @return The area of the triangle.
     */
    @Override
    public double getArea() {
        return 0.5 * length * width;
    }

    /**
     * Calculates the perimeter of the triangle.
     * The perimeter is calculated as the sum of all three sides.
     *
     * @return The perimeter of the triangle.
     */
    @Override
    public double getPerimeter() {
        return length + width + thirdside;
    }

    /**
     * Displays the details of the triangle, including the base, height, third side, area, and perimeter.
     */
    @Override
    public void display() {
        System.out.println("========================");
        System.out.println("Base : " + length);
        System.out.println("Height : " + width);
        System.out.println("Third Side : " + thirdside);
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter : " + getPerimeter());
    }
}
