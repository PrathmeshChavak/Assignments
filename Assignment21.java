class Parent_Class
{
    void display()
    {
        System.out.println("Displaying Name of the user");
    }
}
public class Child_Class extends Parent_Class
{
    void display()
    {
        super.display();
        System.out.println("Displaying Address of the user");
    }
    public static void main(String[] args)
    {
        Child_Class c1=new Child_Class();
        c1.display();
    }
}