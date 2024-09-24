import java.util.Scanner;
class One
{
    static void add()
    {
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter value of a");
       int a=s1.nextInt();
       System.out.println("Enter value of b");
       int b=s1.nextInt();
       int c=a+b;
       System.out.println("Addition of a+b is "+c);
    }
}
class Two extends One
{
   static void sub()
    {
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter value of d");
       int d=s1.nextInt();
       System.out.println("Enter value of e");
       int e=s1.nextInt();
       int f=d-e;
       System.out.println("Subtraction of d-e is "+f);
    } 
}
class Three extends Two
{
    void mul()
    {
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter value of g");
       int g=s1.nextInt();
       System.out.println("Enter value of h");
       int h=s1.nextInt();
       int i=g*h;
       System.out.println("Multiplication of g*h is "+i);
    } 
}
public class Four extends Three
{
    void div()
    {
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter value of j");
       int j=s1.nextInt();
       System.out.println("Enter value of k");
       int k=s1.nextInt();
       int l=j/k;
       System.out.println("Division of j/k is "+l);
    } 
    public static void main(String[] args)
    {
        Four f1=new Four();
        add();
        sub();
        f1.mul();
        f1.div();
    }
}