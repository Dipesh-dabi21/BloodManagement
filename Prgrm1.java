// 1.Write a program that lets the user perform arithmetic operations on two numbers. Your program must be menu driven, allowing the user to select the operation (+, -, *, or /) and input the numbers. Furthermore, your program must consist of following functions:
// a). Function showChoice: This function shows the options to the user and explains how to enter data. b). Function add: This function accepts two number as arguments and returns sum.
// c). Function subtract: This function accepts two number as arguments and returns their difference. d). Function mulitiply: This function accepts two number as arguments and returns product.
// e). Function divide: This function accepts two number as arguments and returns quotient.
import java.util.Scanner;
class Ass1
{
    int a,b;
    void element()
    {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter two number");
        a = ab.nextInt();
        b = ab.nextInt();
    }
    int Add()
    {
        int sum=a+b;
        return sum;
    }
    int Sub()
    {
        int sub=a-b;
        return sub;
    }
    int Mul()
    {
        int mul=a*b;
        return mul;
    }
    int Div()
    {
        int div=a/b;
        return div;
    }
    int Mod()
    {
        int mod=a%b;
        return mod;
    }
    public static void main(String args[])
    {   Scanner ab = new Scanner(System.in);
        Ass1 ob = new Ass1();
        ob.element();
        int n;
        do{
        System.out.println("Select Option Given Below\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulus");
        int sel=ab.nextInt();
        switch(sel)
        {
            case 1:
            System.out.println("Sum of numbr is "+ob.Add());break;
            case 2:
            System.out.println("Sum of numbr is "+ob.Sub());break;
            case 3:
            System.out.println("Sum of numbr is "+ob.Mul());break;
            case 4:
            System.out.println("Sum of numbr is "+ob.Div());break;
            case 5:
            System.out.println("Sum of numbr is "+ob.Mod());break;
            default:System.out.println("Invalid Selection");break;
        }
        System.out.println("Enter 1 for returning to menu");
        n=ab.nextInt();
    
      }while(n==1);
    }
}