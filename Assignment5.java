import java.util.Scanner;
public class Basic
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter value of Pie");
        double pie=s1.nextDouble();
        System.out.println("Enter value of radius");
        double rad=s1.nextDouble();
        double area=pie*rad*rad;
        System.out.println("Area of Circle is"+" "+area);
    }
}