package Chapter7.Inheritance;

public class Circle extends Shape {
   private double radius;
   public Circle(){
       radius=5;
   }

    public Circle(double r){
        radius=r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
       return 2*Math.PI*radius;
    }

    @Override
    public String display() {
          return  "========================"+
            "Radius : "+ radius+
            "Area : "+ getArea()+
         "Perimeter : "+ getPerimeter();
    }
}
