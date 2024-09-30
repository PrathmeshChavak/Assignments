class One
{
    One()
    {
        super(); 
        System.out.println("One");
    }
}
class Two extends One
{
    Two()
    {
        super();
        System.out.println("Two");
    }
}
public class Three extends Two
{
    Three()
    {
        System.out.println("Three");
    }
    public static void main(String[] args)
    {
        new Three();
    }
}