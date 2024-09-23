import java.util.Scanner;

public class CircleArea 
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = s1.nextDouble();
        // you can also write double area = Math.PI * Math.pow(radius, 2);
        double area = Math.PI * radius*radius;
        System.out.println("The area of the circle is: " + area);
    }
}