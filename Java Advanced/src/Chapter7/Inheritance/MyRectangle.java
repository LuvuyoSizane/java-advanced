package Chapter7.Inheritance;

import java.security.NoSuchProviderException;

public class MyRectangle extends Shape{

    public MyRectangle(){
        super();//default constructor of the parent class
    }
    public MyRectangle(double l ,double w){
        //length = l;
        //width = w;
        super(l,w);
    }
}
