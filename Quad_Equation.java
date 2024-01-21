import java.util.Scanner;
class Quad_Equation
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a = input.nextDouble();
        System.out.println("Enter the value of b:");
        double b = input.nextDouble();
        System.out.println("Enter the value of c:");
        double c = input.nextDouble();
        double d = b*b - 4.0*a*c;
        if(d>0.0)
        {
            double r1 = (-b+Math.pow(d,0.5))/(2.0*a);
            double r2 = (-b-Math.pow(d,0.5))/(2.0*a);
            System.out.println("r1 = "+r1+"\nr2 = "+r2);
        }
        else if(d==0.0)
        {
            double r = (-b)/(2.0*a);
            System.out.println("r1 = "+r+"\nr2 = "+r);
        }
        else
        {
            System.out.println("There are no solutions");
        }
    }
}
