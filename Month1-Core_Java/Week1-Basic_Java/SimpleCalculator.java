import java.util.*;

public class SimpleCalculator
{

    public static void main(String arg[])
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the First Number=");
        double n1 =sc.nextDouble();
        System.out.println("Enter the Second Number=");
        double n2 =sc.nextDouble();
        double result;
        System.out.println("Choose which operation do you want to do (+,-,*,/)");

        char operator =sc.next().charAt(0);

        switch(operator)
        {

            case '+':
            result =n1+n2;
            System.out.println("Addition="+result);
            break;
            case '-':
            result =n1-n2;
            System.out.println("Subtraction="+result);
            break;
            case '*':
            result =n1*n2;
            System.out.println("Multiplication="+result);
            break;
            case '/':
            if (n2!=0)
            {
            result =n1/n2;
            System.out.println("Division="+result);
            }
            else
            {
                System.out.println("The number cannot be divide by zero.");
            }
            break;
            default:
            System.out.println("You entered wrong choice.");


        }
        
    }
}