/*WAP on multiple level inheritance using Interface*/

import java.util.Scanner;
interface One
{
      void add();
}
interface Two
{
      void sub();
}
public class Basics implements One,Two
{
     public void add()
    {
      Scanner s1=new Scanner(System.in);
      System.out.println("Enter value of a");
      int a=s1.nextInt();
      System.out.println("Enter value of b");
      int b=s1.nextInt();
      int c=a+b;
      System.out.println("Addition of a+b is "+c);
    }
     public void sub()
    {
      Scanner s1=new Scanner(System.in);
      System.out.println("Enter value of d");
      int d=s1.nextInt();
      System.out.println("Enter value of e");
      int e=s1.nextInt();
      int f=d-e;
      System.out.println("Subtraction of d-e is "+f);
    }
    public static void main(String[] args)
    {
        Basics b1=new Basics();
        b1.add();
        b1.sub();
    }
}
