package Chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0,num2=0,age=0,sum=0,diff=0;
        double quotient=0,product=0;
        String name=null ;
        try{

            System.out.println("Please enter your name : ");
            name = sc.next();
            System.out.println("Please enter your age : ");
            age = sc.nextInt();
            System.out.println("Please enter number 1 : ");
            num1 = sc.nextInt();
            System.out.println("Please enter number 2 : ");
            num2 = sc.nextInt();
            sum =(num1+num2);
            product = Product(num1,num2);
            diff=Difference(num1,num2);
            quotient=Quotient(num1,num2);


        }catch (InputMismatchException ex){
            System.err.println("Incorrect Input");
        }
        catch (ArithmeticException ex){
            System.err.println("You cannot divide by 0");
        }finally {
            System.out.println("++++++++++++++++++++++++\n"+
                    "Name : " + name +"\nAge : "+ age +"\nNumber 1 : "+ num1
                    +"\nNumber 2 : "+ num2 +"\nSum of : "+ num1 + " + " + num2+" = "+sum

                    +"\nDifference : "+ diff
                    +"\nQuotient : "+ quotient
                    +"\nProduct : "+ product);
        }


    }

    public static int Sum(int n1,int n2){
        return n1+n2;
    }

    public static double Product(int n1,int n2){
        return n1*n2;
    }

    public static int Difference(int n1,int n2){
        return n1-n2;
    }

    public static double Quotient(int n1,int n2) throws ArithmeticException
    {
        return n1/n2;
    }


}
