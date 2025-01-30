package Chapter8;

public class Calculator {
 private int num1,num2;

    public Calculator(int num1, int num2) {
        setNum1(num1);
        setNum2(num2);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2)
    {
        if(num2==0)
            throw new IllegalArgumentException("Second number cannot be zero");
        else
            this.num2 = num2;
    }

    public int Sum(){
        return num1+num2;
    }

    public double Product(){
        return num1*num2;
    }

    public  int Difference(){
        return num1-num2;
    }

    public double Quotient()
    {
        if(num2==0)
            throw new IllegalArgumentException("Second number cannot be zero");
        else
        return num1/num2;
    }
}
