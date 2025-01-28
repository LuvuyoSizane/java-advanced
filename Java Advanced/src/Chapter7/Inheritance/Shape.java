package Chapter7.Inheritance;

public class Shape {
    protected double length, width;

    // Getter for the length
    /*
     * Returns the length of the shape.
     * @return the length of the shape
     */
    public double getLength() {
        return length;
    }

    // Setter for the length
    /*
     * Sets the length of the shape.
     * @param length - the new length to set for the shape
     */
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for the width
    /*
     * Returns the width of the shape.
     * @return the width of the shape
     */
    public double getWidth() {
        return width;
    }

    // Setter for the width
    /*
     * Sets the width of the shape.
     * @param width - the new width to set for the shape
     */
    public void setWidth(double width) {
        this.width = width;
    }

    // Default constructor
    /*
     * Default constructor that initializes the shape with a length of 5 and a width of 8.
     */
    public Shape() {
        setLength(7);
        setWidth(5);
    }

    public Shape(double length,double width) {
        setLength(length);
        setWidth(width);
    }

    // Method to calculate the area of the shape
    /*
     * Calculates the area of the shape based on the provided length and width.
     * @param length - the length of the shape
     * @param width - the width of the shape
     * @return the calculated area (length * width)
     */
    public double getArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the shape
    /*
     * Calculates the perimeter of the shape based on the provided length and width.
     * The formula used is: 2 * (length + width).
     * @param length - the length of the shape
     * @param width - the width of the shape
     * @return the calculated perimeter (2 * length + 2 * width)
     */
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public String display(){
       return "========================"+
        "Length : "+length+
        "Width : "+width+
        "Area : "+ getArea()+
        "Perimeter : " + getPerimeter();
    }
}
