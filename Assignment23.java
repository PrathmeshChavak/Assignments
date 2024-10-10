 class SuperMost
{
      void method1()
    {
        System.out.println("This is 1st method of Supermost class");
    }
      void method2()
    {
        System.out.println("This is 2nd method of Supermost class");
    }
}
abstract class Basics1 extends SuperMost
{
    abstract void method3();
    abstract void method4();
    void method5()
    {
         System.out.println("This is 1st concrete method of Abstract class");
    }
    void method6()
    {
         System.out.println("This is 2nd concrete method of Abstract class");
    }
}
public class Subclass1 extends Basics1
{
     void method7()
    {
        System.out.println("This is 1st concrete method of Subclass");
    }
     void method8()
    {
        System.out.println("This is 2nd concrete method of Subclass");
    }
     void method3()
    {
        System.out.println("This is 1st abstract method of Abstract Class");
    }
      void method4()
    {
        System.out.println("This is 2nd abstract method of Abstract Class");
    }
    public static void main(String[] args)
    {
        Subclass1 s1=new Subclass1();
        s1.method1(); //Supermost class concrete method
        s1.method2(); //Supermost class concrete method
        s1.method3(); //abstract class abstract method
        s1.method4(); //abstract class abstract method
        s1.method5(); //abstract class concrete method
        s1.method6(); //abstract class concrete method
        s1.method7(); //subclass concrete method
        s1.method8(); //subclass concrete method
    }
}