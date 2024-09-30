class One
{
    One(String a)
    {
        System.out.println("Grand Parent "+a);
    }
}
class Two extends One
{
    Two(int a,int b)
    {
        super("Performax");
        System.out.println("Parent "+a+" "+b);
    }
}
 class Three extends Two
{
    Three(int a, String b)
    {
        super(7,9);
        System.out.println("Child Class "+a+" "+b);
    }
}
public class Four extends Three
{
    Four()
    {
        super(10, "Max");
        System.out.println("Last One");
    }
    public static void main(String[] args)
    {
        new Four();
    }
}