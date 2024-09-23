import java.util.Scanner;
public class Basic
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter value of base");
        double base=s1.nextDouble();
        System.out.println("Enter value of height");
        double height=s1.nextDouble();
        double area=0.5*base*height;
        System.out.println("Area of Triangle is"+" "+area);
        
    }
}