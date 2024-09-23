public class Basics
{
    void add(int a, int b)
    {
        int c=a+b;
        System.out.println(""Addition is""+"" ""+c);
    }
    void sub(int d, int e)
    {
        int f=d-e;
        System.out.println(""Subtraction is""+"" ""+f);
    }
    void mul(int g, int h)
    {
        int i=g*h;
        System.out.println(""Multiplication is""+"" ""+i);
    }
    void div(double j, double k)
    {
        double l=j/k;
        System.out.println(""Division is""+"" ""+l);
    }
    void mod(int m, int n)
    {
        int o=m%n;
        System.out.println(""Mod is""+"" ""+o);
    }
    public static void main(String[] args)
    {
        Basics b1=new Basics();
        b1.add(7,3);
        b1.sub(8,3);
        b1.mul(3,7);
        b1.div(8,2.5);
        b1.mod(9,2);
    }
    
}"