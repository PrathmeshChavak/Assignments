import java.util.Scanner;
public class Basic
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter value of Length");
        double len=s1.nextDouble();
        System.out.println("Enter value of breath");
        double breath=s1.nextDouble();
        double area=len*breath;
        System.out.println("Area of Rectangle is"+" "+area);
    }
}