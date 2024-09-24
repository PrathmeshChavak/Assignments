import java.util.Scanner;
class One
{
   
    static void add()
    {
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter vlaue of a");
       int a=s1.nextInt();
       System.out.println("Enter vlaue of b");
       int b=s1.nextInt();
       int c=a+b;
       System.out.println("Additon of a+b is "+c);
    }
}
public class Two extends One
{

    static void sub()
    {
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter vlaue of d");
       int d=s1.nextInt();
       System.out.println("Enter vlaue of e");
       int e=s1.nextInt();
       int f=d-e;
       System.out.println("Subtraction of d-e is "+f);
    }
    public static void main(String[] args)
    {
        add();
        sub();
    }
}