package Chapter8;

public class CalcTester {
    public static void main(String[] args) {
        Calculator calc = new Calculator(2,0);
        System.out.println( "\nNumber 1 : "+ calc.getNum1() +"\nNumber 2 : "+ calc.getNum2() +"\nSum of : "+ calc.getNum1() + " + " +
                calc.getNum2()+" = "+calc.Sum()

                +"\nDifference : "+ calc.Difference()
                +"\nQuotient : "+ calc.Quotient()
                +"\nProduct : "+ calc.Product());
    }
}
