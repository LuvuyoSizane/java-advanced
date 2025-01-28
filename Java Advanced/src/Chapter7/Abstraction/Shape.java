package Chapter7.Abstraction;

public abstract class Shape {

    public abstract double getArea();
    public abstract double getPerimeter();

    public String display() {
        return  "========================"+
                "Area : "+ getArea()+
                "Perimeter : "+ getPerimeter();
    }

}
