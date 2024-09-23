import java.util.Scanner;
public class Basic
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter value of s");
        double s=s1.nextDouble();
        double area=s*s;
        System.out.println("Area of square is"+" "+area);
        
    }
}