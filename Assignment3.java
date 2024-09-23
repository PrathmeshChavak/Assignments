public class Basics
{
    static void example(int a, int b)
    {
        int c=a+b;
        System.out.println("Addition of a+b is"+" "+c);
    }
    static void example(int d, double e)
    {
        double f=d-e;
        System.out.println("Subtraction of c-d is"+" "+f);
    }
    static void example(double g, double h)
    {
        double i=g*h;
        System.out.println("Multiplication of g*h is"+" "+i);
    }
    static void example(float j, float k)
    {
        float l=j/k;
        System.out.println("Division of j/k is"+" "+l);
    }
    static void example(double m , int n)
    {
        double o=m%n;
        System.out.println("Mod of m%n is"+" "+o);
    }
    public static void main(String[] args)
    {
        Basics.example(7,8);
        Basics.example(17,9.90);
        Basics.example(8.99,7.65);
        Basics.example(12.0f, 3.0f);
        Basics.example(9.0,2);
        
    }
    
}