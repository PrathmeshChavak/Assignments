abstract class Class1
{
    abstract void method1();
    void method2()
    {
        System.out.println("Triggered for Logout");
    }
}
public class Class2 extends Class1
{
    void method1()
    {
        System.out.println("Triggered for Registration");
    }
    public static void main(String[] args)
    {
        Class2 c1=new Class2();
        c1.method1();
        c1.method2();
    }
}