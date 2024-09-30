public class Basics
{
    Basics()
    {
    
        System.out.println("1st constructor called");
    }
    Basics(int a)
    {
        this();
        System.out.println("2nd constructor called");
    }
    Basics(int a, int b)
    {
        this(5);
        System.out.println("3rd constructor called");
    }
    Basics(int a, String b)
    {
        this(7,10);
        System.out.println("4th constructor called");
    }
    public static void main(String[] args)
    {
        new Basics(7, "Max");
    }
}