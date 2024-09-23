public class Basics
{
     void example(int a, int b)
    {
        int c=a+b;
        System.out.println("Addition of a+b is"+" "+c);
    }
     void example(int d, double e)
    {
        double f=d-e;
        System.out.println("Subtraction of c-d is"+" "+f);
    }
     void example(double g, double h)
    {
        double i=g*h;
        System.out.println("Multiplication of g*h is"+" "+i);
    }
     void example(float j, float k)
    {
        float l=j/k;
        System.out.println("Division of j/k is"+" "+l);
    }
     void example(double m , int n)
    {
        double o=m%n;
        System.out.println("Mod of m%n is"+" "+o);
    }
    public static void main(String[] args)
    {
        Basics b1=new Basics();
        b1.example(7,8);
        b1.example(17,9.90);
        b1.example(8.99,7.65);
        b1.example(12.0f, 3.0f);
        b1.example(9.0,2);
        
    }
    
}